package com.java1234;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.java1234.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class DblockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DblockApplication.class, args);
    }

}
