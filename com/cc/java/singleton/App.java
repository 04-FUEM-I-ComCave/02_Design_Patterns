package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {


    public static void main(String[] args) {
        
        Singleton obj1 = Singleton.getInstance();
        Helper.output(obj1);

        obj1.actOnEvent();
        obj1.actOnEvent();
        // Events werden kumuliert ... 0 + 2
        Helper.output(obj1.getCounter());
        Helper.output("---------------------");

        Singleton obj2 = Singleton.getInstance();
        Helper.output(obj2);

        obj2.actOnEvent();
        obj2.actOnEvent();
        obj2.actOnEvent();
        // Events werden kumuliert ... 2 + 3
        Helper.output(obj2.getCounter());
        Helper.output("---------------------");


        Singleton obj3 = Singleton.getInstance();
        Helper.output(obj3);

        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
		
        // Events werden kumuliert ... 5 + 5
        Helper.output(obj3.getCounter());



    }


}


