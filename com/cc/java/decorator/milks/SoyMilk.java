package com.cc.java.decorator.milks;

import com.cc.java.decorator.abstractions.*;

public class SoyMilk extends Decorator {

    public SoyMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sojamilch";
    }

    @Override
    public double cost() {
        return  coffee.cost() + 0.15;
    }

}

