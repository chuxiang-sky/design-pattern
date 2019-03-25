package com.chuxiang.java.behaviour.observer.sameObserver.observable;

import java.util.Observable;

/**
 * Created by chuxiang_sky on 2019/03/25.
 * 行为型设计模式
 * 观察者模式：又叫做发布订阅模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *              这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * 同种观察者：也可以让被观察者继承JDK提供的java.util.Observable类，让观察者实现JDK提供的java.util.Observer接口（重写update()方法）
 */
public class ConcreteObservable extends Observable {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        setChanged();//更新数据后，需要调用Observable的setChanged()，设置Observable的changed为true
        notifyObservers();//通知方法中会先判断Observable中的changed值，若changed为false,则直接返回，不会调用Observer的update()方法，若changed为true，才会调用
    }


}
