package com.atguigu.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }

}

