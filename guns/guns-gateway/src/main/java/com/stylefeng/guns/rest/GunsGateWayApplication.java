package com.stylefeng.guns.rest;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfiguration
@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
public class GunsGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunsGateWayApplication.class, args);
    }
}
