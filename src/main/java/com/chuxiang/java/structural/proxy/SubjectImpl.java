package com.chuxiang.java.structural.proxy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("ISubject do something...");
    }

    @Override
    public void request1() {
        System.out.println("ISubject can do everything...");
    }
}
