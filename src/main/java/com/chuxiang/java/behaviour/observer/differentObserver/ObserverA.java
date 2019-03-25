package com.chuxiang.java.behaviour.observer.differentObserver;

import com.chuxiang.java.behaviour.observer.ISubject;
import com.sun.org.apache.bcel.internal.generic.ISUB;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class ObserverA {
    private ISubject subject;

    public ObserverA(ISubject subject) {
        this.subject = subject;
    }

    public void update(){
        System.out.println("ObserverA观察到了变化："+subject);
    }
}
