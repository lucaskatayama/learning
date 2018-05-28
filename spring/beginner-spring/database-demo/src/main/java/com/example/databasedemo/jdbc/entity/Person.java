package com.example.databasedemo.jdbc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthDate;
}
