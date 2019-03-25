package com.chuxiang.java.behaviour.observer.sameObserver;

import com.chuxiang.java.behaviour.observer.IObserver;
import com.chuxiang.java.behaviour.observer.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chuxiang_sky on 2019/03/25.
 * 行为型设计模式
 * 观察者模式：又叫做发布订阅模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *              这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * 同种观察者：所有的观察者都同属于一个类型（实现了相同接口），
 *             可采用com.chuxiang.java.behaviour.observer.sameObserver中的写法
 *             但当观察者不是同一个类型时，此种写法无法实现
 */
public class ConcreteSubject implements ISubject {

    private String state;

    private List<IObserver> observerList;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<IObserver> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<IObserver> observerList) {
        this.observerList = observerList;
    }

    public void addObserver(IObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(o->o.update());
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" +
                "state='" + state + '\'' +
                '}';
    }
}
