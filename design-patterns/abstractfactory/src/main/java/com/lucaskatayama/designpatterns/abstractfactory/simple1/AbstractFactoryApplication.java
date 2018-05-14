package com.lucaskatayama.designpatterns.abstractfactory.simple1;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();

        AbstractProductA pa = f1.createProductA();
        AbstractProductB pb = f1.createProductB();

        System.err.println(String.format("Product A: %s, Product B: %s", pa.getName(), pb.getName()));

        AbstractFactory f2 = new ConcreteFactory2();
        pa = f2.createProductA();
        pb = f2.createProductB();

        System.err.println(String.format("Product A: %s, Product B: %s", pa.getName(), pb.getName()));



    }
}
