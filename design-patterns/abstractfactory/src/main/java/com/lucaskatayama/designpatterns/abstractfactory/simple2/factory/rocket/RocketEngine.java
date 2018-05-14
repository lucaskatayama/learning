package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.rocket;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Engine;
import lombok.Data;

@Data
public class RocketEngine implements Engine {
    @Override
    public String getName() {
        return "Rocket Engine";
    }
}
