package com.atguigu.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;
@RefreshScope
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.cloud.mapper")
public class Main8001 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(Main8001.class, args);
    }

}