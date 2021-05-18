package com.example;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Api(value = "Benim Pet API Dokumentasyonum")
public class SpringBootDocApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDocApplication.class, args);

    }
}
