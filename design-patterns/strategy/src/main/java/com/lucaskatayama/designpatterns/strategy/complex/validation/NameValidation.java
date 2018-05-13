package com.lucaskatayama.designpatterns.strategy.complex.validation;

public class NameValidation implements Validation {

    @Override
    public Boolean validate(String input) {
        // input can't be empy
        if (input.isEmpty()) {
            return false;
        }
        return true;
    }
}
