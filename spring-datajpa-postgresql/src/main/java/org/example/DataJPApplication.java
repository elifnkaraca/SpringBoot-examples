package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DataJPApplication {

    public static void main(String[] args) {

        SpringApplication.run(DataJPApplication.class, args);

    }
}
