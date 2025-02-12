package com.cc.java.observer.interfaces;

public interface IObserve {

    // update
    public abstract void update(); // pull
    public abstract void update(String msg); // push

    // subscribe
    public abstract void subscribe(); 
    public abstract void unsubscribe(); 
}
