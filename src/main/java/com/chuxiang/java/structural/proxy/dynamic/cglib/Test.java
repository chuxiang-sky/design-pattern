package com.chuxiang.java.structural.proxy.dynamic.cglib;

import com.chuxiang.java.structural.proxy.Subject;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {
    public static void main(String[] args) {
        Subject target = new Subject();
        Subject proxy = (Subject)new ProxyByCglib(target).createProxy();
        proxy.doSomething();

    }
}
