package com.example.camjontest;

import com.example.camjontest.Model.Dog;
import com.example.camjontest.Model.DogRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CamJonTestApplication {

    private static final Logger log = LoggerFactory.getLogger(CamJonTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CamJonTestApplication.class, args);
    }


    @Bean
    public CommandLineRunner importData(DogRepo camRepo){
        return (args) -> {
            final List<Dog> dogList = new ArrayList<>();
            dogList.add(new Dog("Scubi","Malthese", 2,6000.0));
            dogList.add(new Dog("Nana","Goldenretreiver", 4,3000.0));
            dogList.add(new Dog("Goldie","Pitbull", 1,4000.0));
            dogList.add(new Dog("chico","Chihuahua", 4,7000.0));
            dogList.add(new Dog("Diana","Puddle", 4,5000.0));
            dogList.add(new Dog("bobbi","Sanktbernard", 2,4000.0));


        };

    }

}
