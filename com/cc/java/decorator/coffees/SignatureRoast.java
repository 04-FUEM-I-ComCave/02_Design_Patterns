package com.cc.java.decorator.coffees;

import com.cc.java.decorator.abstractions.*;

public class SignatureRoast extends Coffee {
    
    public SignatureRoast() {
        description = "Kräftiger Signature Roast";
    }

    @Override
    public double cost() {
        return 1.80;
    }
}
