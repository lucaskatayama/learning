package com.example.databasedemo;

import com.example.databasedemo.entity.Person;
import com.example.databasedemo.jdbc.PersonJDBCDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJDBCDao personJDBCDao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Person> people = personJDBCDao.findAll();
        System.err.println(people);

        Person person = personJDBCDao.findById(people.get(0).getId());
        System.err.println(person);

        personJDBCDao.deleteById(person.getId());
        people = personJDBCDao.findAll();
        System.err.println(people);

    }
}
