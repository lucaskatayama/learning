package com.lucaskatayama.designpatterns.strategy.complex;

import com.lucaskatayama.designpatterns.strategy.complex.validation.Validation;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Column {
    protected String name;
    protected String type;
    protected Validation validation;

    public Boolean validate(String input) {
        return this.validation.validate(input);
    }
}
