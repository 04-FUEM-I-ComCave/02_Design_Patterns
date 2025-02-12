package com.cc.java.decorator.toppings;

import com.cc.java.decorator.abstractions.*;


public class Whip extends Decorator {

    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sahne";
    }

    @Override
    public double cost() {
        return  coffee.cost() + .12;
    }

}

