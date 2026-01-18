package org.example.jobmockweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobMockWebApplication {

    public static void main(String[] args) {
        System.out.println("Starting JobMockWebApplication");
        SpringApplication.run(JobMockWebApplication.class, args);
    }

}
