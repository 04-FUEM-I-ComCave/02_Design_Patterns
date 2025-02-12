package com.cc.java.decorator.milks;

import com.cc.java.decorator.abstractions.*;


public class Milk extends Decorator {

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milch";
    }

    @Override
    public double cost() {
        return  coffee.cost() + 0.15;
    }

}

