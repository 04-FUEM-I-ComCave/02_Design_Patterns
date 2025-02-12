package com.cc.java.observer.pubsub;

import com.cc.java.observer.interfaces.IObserve;
import com.cc.java.tools.Helper;

public class Observer implements IObserve{

    private Subject s;
    private String name;
    private boolean pushed;

    public Observer(Subject s, String name) {
        this.s = s;
        this.name = name;
    }

    @Override
    public void subscribe() {
       s.attach(this); // Abo starten
    }

    @Override
    public void unsubscribe() {
       s.detatch(this);// Abo beenden
    }

    @Override
    public void update() { // pull
        String str = name + " observes by pull, that subject changed its state to: " + s.getState();
        Helper.output(str);
    }

    @Override
    public void update(String msg) { // push
        String str = name + " observes by push, that subject changed its state to: " + msg;
        Helper.output(str);
    }

    public boolean isPushed() {
        return pushed;
    }

    public void setPushed(boolean pushed) {
        this.pushed = pushed;
    }
    




}
