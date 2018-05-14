package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Engine;
import lombok.Data;

@Data
public class UFOEngine implements Engine {
    @Override
    public String getName() {
        return "UFO Engine";
    }
}
