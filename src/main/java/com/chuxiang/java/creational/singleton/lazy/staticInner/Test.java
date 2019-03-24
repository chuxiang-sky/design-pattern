package com.chuxiang.java.creational.singleton.lazy.staticInner;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {

        Thread t7 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t7");
        Thread t8 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t8");
        t7.start();
        t8.start();

    }
}
