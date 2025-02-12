package com.cc.java.decorator.toppings;

import com.cc.java.decorator.abstractions.*;


public class Schoko extends Decorator {

    public Schoko(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Schoko";
    }

    @Override
    public double cost() {
        return  coffee.cost() + .12;
    }

}

