package com.lzj.simplespeedkill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzj.simplespeedkill.dao")
public class SimplespeedkillApplication {

    public static void main(String[] args) {

        SpringApplication.run(SimplespeedkillApplication.class, args);

    }

}
