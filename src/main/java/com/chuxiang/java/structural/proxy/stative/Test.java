package com.chuxiang.java.structural.proxy.stative;

import com.chuxiang.java.structural.proxy.ISubject;
import com.chuxiang.java.structural.proxy.SubjectImpl;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    public static void main(String[] args) {
        ISubject proxy = new Proxy(new SubjectImpl());
        proxy.request();
        proxy.request1();
    }
}
