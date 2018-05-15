package com.lucaskatayama.designpatterns.singleton.simple;

import java.text.SimpleDateFormat;

public class SingletonApplication {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd HH:MM:ss");
        System.err.println("First: " + sdf.format(singleton.getDate()));

        singleton = Singleton.getInstance();
        System.err.println("Second: " + sdf.format(singleton.getDate()));
    }
}
