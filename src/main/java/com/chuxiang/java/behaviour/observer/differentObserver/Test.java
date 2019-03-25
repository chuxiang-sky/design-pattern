package com.chuxiang.java.behaviour.observer.differentObserver;

import com.chuxiang.java.behaviour.observer.ISubject;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        try {
            subject.addEvent(new ObserverA(subject),"update",null);
            subject.addEvent(new ObserverB(subject),"modify",null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        subject.setState("更新");
        subject.notifyObservers();
    }
}
