package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(1958, Month.FEBRUARY, 14)
            );

            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 23)
            );

            System.out.println("About to save students...");

            repository.saveAll(List.of(mariam, alex));

            System.out.println("Students saved successfully!");
        };
    }




}
