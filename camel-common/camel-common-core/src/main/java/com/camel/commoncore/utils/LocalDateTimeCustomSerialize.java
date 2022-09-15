package com.camel.commoncore.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 将localdatetime转换成long 时间戳
 * @author haiming
 */
public class LocalDateTimeCustomSerialize extends JsonSerializer<LocalDateTime> {
    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        long timestamp = value.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        gen.writeString(String.valueOf(timestamp));
    }
}
