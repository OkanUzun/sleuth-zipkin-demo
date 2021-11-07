package com.okan.sleuthdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SleuthDemoApplication {

    private final static Logger LOG = LoggerFactory.getLogger(SleuthDemoApplication.class);

    public static void main(final String[] args) {
        SpringApplication.run(SleuthDemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
}
