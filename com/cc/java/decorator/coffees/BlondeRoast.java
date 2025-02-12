package com.cc.java.decorator.coffees;

import com.cc.java.decorator.abstractions.*;

public class BlondeRoast extends Coffee {

    public BlondeRoast() {
        description = "Leichter Blonde Roast";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
