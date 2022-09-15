package com.camel.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title: CamelGatewayAppracation
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/14 0014 17:13
 * @Version: 1.0
 *
 *  * @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })  排除spring自动注入数据源  ， 用于多数据源的情况
 *
 */
@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class
        }
)
@EnableDiscoveryClient
public class CamelGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelGatewayApplication.class, args);
    }

}
