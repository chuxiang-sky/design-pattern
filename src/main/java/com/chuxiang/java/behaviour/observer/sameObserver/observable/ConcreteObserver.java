package com.chuxiang.java.behaviour.observer.sameObserver.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+"观察到了变化："+o);
    }
}
