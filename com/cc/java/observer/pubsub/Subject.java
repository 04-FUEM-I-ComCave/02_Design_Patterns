package com.cc.java.observer.pubsub;

import java.util.ArrayList;
import java.util.List;

import com.cc.java.observer.interfaces.Observable;
import com.cc.java.tools.Helper;

public class Subject implements Observable{

    private String state;
    private List<Observer>observers;

    public Subject() {
       observers = new ArrayList<>();
    }

    /* Abonnenten-Management */
   
    @Override
    public void attach(Observer o) {
        observers.add(o);  // Observer tragen sich in Abo-Liste ein
    }

    @Override
    public void detatch(Observer o) {
        observers.remove(o); // Observer lassen sich aus Abo-Liste löschen
    }

    /* Status */

    // Subjekt ändert seinen Status (Post/Video ...)
    public void setState(String state) {
        this.state = state;
        Helper.output("Subject's new state: " + state);
        notifyObservers();
    }

    /* Benachrichtigung der Abonennten*/

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            if (o.isPushed()) {
                o.update(state); // Push
            } else {
                o.update();  // Pull
            }
        }
    }

      // Observer holen sich den neuen Status ...
    public String getState() {
        return state;
    }




}



  
