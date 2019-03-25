package com.chuxiang.java.behaviour.observer.sameObserver;

import com.chuxiang.java.behaviour.observer.IObserver;
import com.chuxiang.java.behaviour.observer.ISubject;

/**
 * Created by chuxiang_sky on 2019/03/25.
 *
 */
public class ConcreteObserver implements IObserver {

    private ISubject subject;

    private String name;

    public ConcreteObserver(ISubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name+"观察到了变化："+subject);
    }
}
