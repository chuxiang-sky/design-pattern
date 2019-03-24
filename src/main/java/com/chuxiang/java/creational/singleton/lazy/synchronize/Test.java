package com.chuxiang.java.creational.singleton.lazy.synchronize;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {

        //解决了一般懒汉式单例的线程安全问题
        Thread t3 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t3");
        Thread t4 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t4");
        t3.start();
        t4.start();

    }
}
