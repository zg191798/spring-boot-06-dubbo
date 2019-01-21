package com.atguigu.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}

