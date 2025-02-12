package com.cc.java.observer;

import com.cc.java.observer.pubsub.Observer;
import com.cc.java.observer.pubsub.Subject;
import com.cc.java.tools.Helper;

public class App {

public static void main(String[] args) {
    

        // Objekte instanziieren
        Subject s = new Subject();
        Observer ob1 = new Observer(s, "Bob");
        Observer ob2 = new Observer(s, "Alice");
        Observer ob3 = new Observer(s, "Maxine");

        // Bob & Alice abonnieren den Kanal ...
        ob1.subscribe();
        ob2.subscribe();

        s.setState("Neuer Post auf IG");
        Helper.output("---------------");

        // ob1.setPushed(true); // Max aktiviert die Glocke!
        // s.setState("Neuer Live-Stream!");
        // Helper.output("---------------");

        // // FOMO? : Maxine abonniert ...
        // ob3.subscribe();
        // s.setState("Neuer Post über Solana");
        // Helper.output("---------------");

        // //  Maxine kündigt Ihr Abo wieder ...
        // s.detatch(ob3);  


        // s.setState("Neuer Post über Polkadot");
        // Helper.output("---------------");





}





}
