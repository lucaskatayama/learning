package com.example.databasedemo.jdbc;

import com.example.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJDBCDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * from person where id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update(
                "DELETE FROM person WHEre id=?",
                new Object[]{id});
    }
}
