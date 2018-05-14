package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.rocket;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Fuel;
import lombok.Data;

@Data
public class RocketFuel implements Fuel {
    @Override
    public String getName() {
        return "Rocket Fuel";
    }
}
