package com.camel.commoncore.utils;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: JsonUtils
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/15 0015 10:36
 * @Version: 1.0
 *
 * 1.用法
 * @UtilityClass // lombok注解，自动生成私有构造函数 ， 并且给所有的类都加上static关键字
 */
@UtilityClass
public class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 带有时间的序列化的类需要特殊处理
     */
    private static String[] parseObjectFields =
            {

            };

    static {
        /**
         * 修复异常  com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "class"
         * #3）解决办法：忽略未知字段 DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES默认是true。
         */
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public static void init(ObjectMapper objectMapper) {
        JsonUtils.objectMapper = objectMapper;
    }

    @SneakyThrows
    public static String toJsonString(Object object) {
        return objectMapper.writeValueAsString(object);
    }

    @SneakyThrows
    public static byte[] toJsonByte(Object object) {
        return objectMapper.writeValueAsBytes(object);
    }

    public static <T> T parseObject(String json, Class<T> clazz) {
        try {
            String name = clazz.getName();

            if(ArrayUtil.contains(parseObjectFields, name)){
                objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                objectMapper.registerModule(new JavaTimeModule());
            }
            return objectMapper.readValue(json, clazz);
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }

    /**
     * 基于hutool的json工具类
     * @param text
     * @param clazz
     * @return
     * @param <T>
     */
    public static <T> T huToolParseObject(String text, Class<T> clazz){
        if (StrUtil.isEmpty(text)) {
            return null;
        }
        return JSONUtil.toBean(text, clazz);
    }


    public static <T> T parseObject(byte[] bytes, Class<T> clazz) {
        if (ArrayUtil.isEmpty(bytes)) {
            return null;
        }
        try {
            return objectMapper.readValue(bytes, clazz);
        } catch (IOException e) {
            logger.error("json parse err,json:{}", bytes, e);
            throw new RuntimeException(e);
        }
    }

    public static <T> T parseObject(String text, TypeReference<T> typeReference) {
        try {
            objectMapper.registerModule(new JavaTimeModule());

            return objectMapper.readValue(text, typeReference);
        } catch (IOException e) {
            logger.error("json parse err,json:{}", text, e);
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> parseArray(String text, Class<T> clazz) {
        if (StrUtil.isEmpty(text)) {
            return new ArrayList<>();
        }
        try {
            return objectMapper.readValue(text, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            logger.error("json parse err,json:{}", text, e);
            throw new RuntimeException(e);
        }
    }

    public static JsonNode readTree(String text) {
        try {
            return objectMapper.readTree(text);
        } catch (IOException e) {
            logger.error("json parse err,json:{}", text, e);
            throw new RuntimeException(e);
        }
    }

    public static JsonNode readTree(byte[] text) {
        try {
            return objectMapper.readTree(text);
        } catch (IOException e) {
            logger.error("json parse err,json:{}", text, e);
            throw new RuntimeException(e);
        }
    }


}
