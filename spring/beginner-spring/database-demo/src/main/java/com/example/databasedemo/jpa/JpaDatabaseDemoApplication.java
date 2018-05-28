package com.example.databasedemo.jpa;

import com.example.databasedemo.jpa.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDatabaseDemoApplication implements CommandLineRunner {

    private static final Logger _logger = LoggerFactory.getLogger(JpaDatabaseDemoApplication.class);

    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        _logger.debug("User id 1001 -> {}", personJpaRepository.findById(1001));
    }
}
