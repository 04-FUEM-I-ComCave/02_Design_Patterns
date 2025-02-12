package com.cc.java.decorator.milks;

import com.cc.java.decorator.abstractions.*;

public class OatMilk extends Decorator {

    public OatMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Hafermilch";
    }

    @Override
    public double cost() {
        return  coffee.cost() + 0.15;
    }

}

