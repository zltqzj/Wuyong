package com.wuyong.useless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages={"com.wy"})
public class UselessApplication {

    public static void main(String[] args) {

        SpringApplication.run( UselessApplication.class, args );
    }


}
