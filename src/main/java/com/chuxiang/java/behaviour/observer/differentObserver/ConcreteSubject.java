package com.chuxiang.java.behaviour.observer.differentObserver;

import com.chuxiang.java.behaviour.observer.ISubject;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chuxiang_sky on 2019/03/25.
 * 行为型设计模式
 * 观察者模式：又叫做发布订阅模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *              这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * 不同种观察者：观察者不都同属于一个类型（实现了相同接口），
 *             可采用com.chuxiang.java.behaviour.observer.differentObserver中的写法
 *             将不同观察者的实例对象，更新方法及其参数用一个类（EventHandler）封装，
 *             再被观察者通知观察者的时候，利用Java反射机制调用观察者的更新方法
 */
public class ConcreteSubject implements ISubject {

    private String state;

    private List<EventHandler> events;

    public ConcreteSubject() {
        this.events = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addEvent(Object obj,String methodName,Object[] args) throws NoSuchMethodException {
        events.add(new EventHandler(obj,obj.getClass().getMethod(methodName),args));
    }

    public void removeEvent(Object obj){
        Iterator<EventHandler> iterator = events.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getObj()==obj){
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyObservers() {
        events.stream().forEach(e->{
            try {
                e.getMethod().invoke(e.getObj(),e.getArgs());
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e1) {
                e1.printStackTrace();
            }
        });
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" +
                "state='" + state + '\'' +
                '}';
    }
}
