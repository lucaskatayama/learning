package com.lucaskatayama.designpatterns.strategy.complex;

import com.lucaskatayama.designpatterns.strategy.complex.validation.AdminValidation;
import com.lucaskatayama.designpatterns.strategy.complex.validation.AgeValidation;
import com.lucaskatayama.designpatterns.strategy.complex.validation.NameValidation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StrategyComplexExampleApplication {

    public static void main(String[] args) throws IOException {

        List<Column> columns = new ArrayList<>();
        columns.add(Column.builder().name("name").validation(new NameValidation()).build());
        columns.add(Column.builder().name("age").validation(new AgeValidation()).build());
        columns.add(Column.builder().name("admin").validation(new AdminValidation()).build());
        InputStream is = StrategyComplexExampleApplication.class.getResourceAsStream("/complex-example.csv");

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        // read header
        reader.readLine();
        int count = 0;
        while ((line = reader.readLine()) != null) {
            // read line by line
            String[] columnValues = line.split(",");
            Column c;
            for (int i = 0; i < columnValues.length; i++) {
                c = columns.get(i);
                if (!c.validate(columnValues[i])) {
                    System.err.println(String.format("Error line %d column %d validator %s line [%s]", count, i, c.getName(),  line));
                }
            }
            count++;
        }
    }
}
