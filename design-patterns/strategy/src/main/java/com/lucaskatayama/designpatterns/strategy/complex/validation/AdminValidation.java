package com.lucaskatayama.designpatterns.strategy.complex.validation;

public class AdminValidation implements Validation {

    @Override
    public Boolean validate(String input) {
        if (Boolean.TRUE.toString().equals(input) || Boolean.FALSE.toString().equals(input)) {
            return true;
        }
        return false;
    }
}
