package com.chuxiang.java.behaviour.observer.sameObserver.observable;

import java.util.Observable;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        observable.addObserver(new ConcreteObserver("观察者A"));
        observable.addObserver(new ConcreteObserver("观察者B"));
        observable.addObserver(new ConcreteObserver("观察者C"));
        observable.setState("更新");
    }
}
