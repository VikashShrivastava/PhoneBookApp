package com.example.phonebookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.example.phonebookapp.Repository")
@EntityScan("com.*")
@ComponentScan("com.*")
public class PhoneBookAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneBookAppApplication.class, args);
    }

}
