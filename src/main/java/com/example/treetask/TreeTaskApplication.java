package com.example.treetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class TreeTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeTaskApplication.class, args);
    }

}
