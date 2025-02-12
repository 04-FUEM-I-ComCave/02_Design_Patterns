package com.cc.java.observer.interfaces;

import com.cc.java.observer.pubsub.Observer;

public interface Observable {

    // abstrakt, Management der Subscriberliste
       public abstract void attach(Observer o);
       public abstract void detatch(Observer o);
   
       // abstrakt
       public abstract void notifyObservers();
   
   
   }
   