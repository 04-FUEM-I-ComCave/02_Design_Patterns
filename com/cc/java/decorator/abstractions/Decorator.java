package com.cc.java.decorator.abstractions;

public abstract class Decorator extends Coffee {

    // konkret
    protected Coffee coffee;  // Referenz

    // abstrakt
    public abstract String getDescription();

}
