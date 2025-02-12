package com.cc.java.decorator.flavours;

import com.cc.java.decorator.abstractions.*;


public class Vanilla extends Decorator {

    public Vanilla(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Vanille";
    }

    @Override
    public double cost() {
        return  coffee.cost() + 0.30;
    }

}