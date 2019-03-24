package com.chuxiang.java.structural.proxy.dynamic.jdk;

import com.chuxiang.java.structural.proxy.ISubject;
import com.chuxiang.java.structural.proxy.SubjectImpl;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    public static void main(String[] args) {
        ISubject target = new SubjectImpl();
        ISubject proxy = (ISubject) new ProxyByJdk(target).createProxyByJdk();
        proxy.request();
        proxy.request1();
    }
}
