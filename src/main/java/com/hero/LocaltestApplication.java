package com.hero;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class LocaltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocaltestApplication.class, args);
        log.info("已启动");
    }

}
