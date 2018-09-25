package com.zxp.mybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.zxp.mybaits.dao")
@SpringBootApplication
public class MybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsApplication.class, args);
    }
}
