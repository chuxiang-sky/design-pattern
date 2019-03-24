package com.chuxiang.java.structural.proxy.stative;

import com.chuxiang.java.structural.proxy.ISubject;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 结构型设计模式
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问（功能增强，例如AOP，事务）
 * 静态代理：定义了一个共用接口ISubject，代理类Proxy和被代理类SubjectImpl都实现了该接口，
 * 并且代理类Proxy还持有一个ISubject类型的实例对象（new SubjectImpl()），
 * 在代理类Proxy的实例方法中调用该对象的实例方法，并且同时增加一些额外的逻辑
 */
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("before request");
        subject.request();
        System.out.println("after request");
    }

    @Override
    public void request1() {
        System.out.println("before request1");
        subject.request1();
        System.out.println("after request1");
    }
}
