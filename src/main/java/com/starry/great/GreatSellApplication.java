package com.starry.great;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
public class GreatSellApplication {
    public static void main(String[] args) {

        SpringApplication.run(GreatSellApplication.class,args);
        log.info("项目启动成功！");
    }
}
