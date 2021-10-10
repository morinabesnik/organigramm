package com.mobe.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mobe.*"})
@EntityScan(basePackages = {"com.mobe.*"})
@EnableJpaRepositories(basePackages = {"com.mobe.*"})
public class EmployeeDistributionApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeDistributionApplication.class);
    }
}
