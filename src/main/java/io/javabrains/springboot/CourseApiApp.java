package io.javabrains.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan("io.javabrains.*")

public class CourseApiApp {

    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);
    }
//    public CommandLineRunner topicData())-> Arrays.asList("");
//    }
}

