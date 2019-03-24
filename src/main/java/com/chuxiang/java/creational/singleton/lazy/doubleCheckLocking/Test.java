package com.chuxiang.java.creational.singleton.lazy.doubleCheckLocking;

import com.chuxiang.java.creational.singleton.lazy.synchronize.Singleton;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {

        Thread t5 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t5");
        Thread t6 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t6");
        t5.start();
        t6.start();

    }
}
