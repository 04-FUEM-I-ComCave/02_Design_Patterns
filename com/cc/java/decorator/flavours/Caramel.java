package com.cc.java.decorator.flavours;

import com.cc.java.decorator.abstractions.*;

public class Caramel extends Decorator {

    public Caramel(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Karamell";
    }

    @Override
    public double cost() {
        return  coffee.cost() + .30;
    }

}