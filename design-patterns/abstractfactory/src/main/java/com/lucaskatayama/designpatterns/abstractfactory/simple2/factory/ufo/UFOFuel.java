package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Fuel;
import lombok.Data;

@Data
public class UFOFuel implements Fuel {
    @Override
    public String getName() {
        return "UFO Fuel";
    }
}
