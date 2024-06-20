package com.example.managementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication public class ManagementSystemApplication
{
    public static void main(String[] args)
    {
        //SpringApplication.run(ManagementSystemApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(ManagementSystemApplication.class, args);
        System.out.println("Application started successfully");
    }
}
