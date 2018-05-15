package com.lucaskatayama.designpatterns.singleton.simple;

import java.util.Date;

public class Singleton {

    private static Singleton instance = null;

    private Date date;

    private Singleton() {
        this.date = new Date();
    }

    public static Singleton getInstance() {
        // lazy instantiation
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Date getDate() {
        return date;
    }
}
