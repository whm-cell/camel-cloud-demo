package com.camel.commoncore.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author 码农海明
 * @date 2021/1/15 17:48
 * 概要：
 *      雪花算法生成19位 long类型的数值
 */
@Repository
@Slf4j
public class IdSnowflake {

    private long workId = 0;
    private long datacenterId = 1;
    private Snowflake snowflake = IdUtil.createSnowflake(workId, 1);

    @PostConstruct
    public void init() {
        workId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
    }

    public synchronized long snowflakeId() {
        return snowflake.nextId();
    }

    // 范围为0~31
    public synchronized long snowflakeId(long workId, long datacenterId) {
        Snowflake snowflake = IdUtil.createSnowflake(workId, datacenterId);
        return snowflake.nextId();
    }
}
