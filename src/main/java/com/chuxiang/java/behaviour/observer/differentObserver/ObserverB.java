package com.chuxiang.java.behaviour.observer.differentObserver;

import com.chuxiang.java.behaviour.observer.ISubject;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class ObserverB {
    private ISubject subject;

    public ObserverB(ISubject subject) {
        this.subject = subject;
    }

    public void modify(){
        System.out.println("ObserverB观察到了变化："+subject);
    }
}
