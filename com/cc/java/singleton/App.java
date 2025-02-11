package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {


    public static void main(String[] args) {
        
        Singleton obj = new Singleton();
        Helper.output(obj);

        Singleton obj2 = new Singleton();
        Helper.output(obj2);
    }


}


