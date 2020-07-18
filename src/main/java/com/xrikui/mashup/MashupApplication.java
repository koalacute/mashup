package com.xrikui.mashup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@MapperScan("com.xrikui.mashup.mapper")
@PropertySource(value = "classpath:/config/*.yml", ignoreResourceNotFound = true)
@SpringBootApplication
public class MashupApplication {
    public static void main(String[] args) {
        SpringApplication.run(MashupApplication.class, args);
    }
}
