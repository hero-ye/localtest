package com.hero;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Log
@EnableSwagger2
public class LocaltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocaltestApplication.class, args);
        log.info("已启动");
    }

}
