package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariem = new Student(
                    "Mariem",
                    "benyoussefmeriem27@gmail.com",
                    LocalDate.of(1999, Month.JUNE,27)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.JUNE,27)
            );

            repository.saveAll(
                    List.of(mariem, alex)
            );

        };
    }
}
