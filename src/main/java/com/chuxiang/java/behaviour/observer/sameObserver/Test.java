package com.chuxiang.java.behaviour.observer.sameObserver;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver(subject,"观察者1"));
        subject.addObserver(new ConcreteObserver(subject,"观察者2"));
        subject.addObserver(new ConcreteObserver(subject,"观察者3"));
        subject.setState("新增");
        subject.notifyObservers();
    }
}
