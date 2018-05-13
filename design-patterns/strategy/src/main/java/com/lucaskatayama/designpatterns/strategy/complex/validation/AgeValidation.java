package com.lucaskatayama.designpatterns.strategy.complex.validation;

public class AgeValidation implements Validation {
    @Override
    public Boolean validate(String input) {
        Integer age = Integer.parseInt(input);
        if (age == null || age <= 0) {
            return false;
        }
        return true;
    }
}
