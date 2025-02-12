package com.cc.java.decorator.abstractions;

public abstract class Coffee {

    // konktret
    protected String description;  // Beschreibung des Getränks

    public String getDescription() {
        return description;
    }

    // abstrakt
    public abstract double cost();  // Preis des Getränks

}
