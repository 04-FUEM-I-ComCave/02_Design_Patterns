package com.cc.java.decorator;

import com.cc.java.tools.Helper;
import com.cc.java.decorator.abstractions.*;
import com.cc.java.decorator.coffees.*;
import com.cc.java.decorator.flavours.*;
import com.cc.java.decorator.milks.*;
import com.cc.java.decorator.toppings.*;

public class Filiale 
{
    public static void main(String[] args) {

      Coffee coffee1 = new BlondeRoast();
      Helper.output(coffee1.getDescription() + " $" + coffee1.cost());
      coffee1 = new Milk(coffee1);
      Helper.output(coffee1.getDescription() + " $" + coffee1.cost());
      Helper.output("-----------------------------------");

      Coffee coffee2 = new BlondeRoast();
      Helper.output(coffee2);
      coffee2 = new SoyMilk(coffee2);
      Helper.output(coffee2);
      coffee2 = new Caramel(coffee2);
      Helper.output(coffee2);
      coffee2 = new Schoko(coffee2);
      Helper.output(coffee2);
      Helper.output(coffee2.getDescription() + " $" + coffee2.cost());
      Helper.output("-----------------------------------");


      Coffee coffee3 = new SignatureRoast();
      coffee3 = new Milk(coffee3);
      coffee3 = new Milk(coffee3);
      Helper.output(coffee3.getDescription() + " $" + coffee3.cost());

      Coffee coffee4 = new SignatureRoast();
      coffee4 = new Vanilla(coffee4);
      coffee4 = new Whip(coffee4);
      coffee4 = new Schoko(coffee4);
      coffee4 = new Schoko(coffee4);
      Helper.output(coffee4.getDescription() + " $" + coffee4.cost());

      }

    
    
}


