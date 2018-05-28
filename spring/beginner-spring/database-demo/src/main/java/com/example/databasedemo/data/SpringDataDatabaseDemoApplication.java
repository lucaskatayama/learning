package com.example.databasedemo.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDatabaseDemoApplication implements CommandLineRunner {

    private static final Logger _logger = LoggerFactory.getLogger(SpringDataDatabaseDemoApplication.class);

    @Autowired
    PersonRepository personRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringDataDatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        _logger.debug("User id 1001 -> {}", personRepository.findById(1001));
    }
}
