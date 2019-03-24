package com.chuxiang.java.creational.singleton.lazy;

import com.chuxiang.java.creational.singleton.lazy.synchronize.Singleton;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {
        //在单线程下测试懒汉式单例
//        Singleton s1 = Singleton.getInstance();
//        System.out.println("对象s1："+s1);
//        Singleton s2 = Singleton.getInstance();
//        System.out.println("对象s2："+s2);
//        System.out.println("s1==s2："+(s1==s2));

        //在多线程下验证懒汉式单例的线程安全性问题
        //在多线程时，每个线程获取到的对象可能是不同的
        //线程t1和t2返回相同对象的场景有两种，分别如下：
        // 1.t1先执行完Singleton.getInstance()获取到了返回值，t2再执行Singleton.getInstance()时，if语句判断条件为false，直接返回
        // 2.t1执行Singleton.getInstance()时，if语句条件判断为true，
        //   然后切换到t2执行Singleton.getInstance()，if语句条件为true，执行下一句new语句后，
        //   再切换到t1执行new语句，
        //   此时t2中执行new语句创建的实例化对象其实被t1中new语句创建的对象覆盖，故t1和t2返回的对象是同意实例化对象
        //线程t1和t2返回不同对象的场景如下：
        // 1.t1执行Singleton.getInstance()时，if语句条件判断为true，
        //   然后切换到t2执行Singleton.getInstance()，if语句条件为true，执行下一句new语句后，继续执行return语句，将实例化对象返回
        //   再切换到t1执行下一句new语句后，继续执行return语句，将实例化对象返回
        //   两个线程返回的对象是不同的
        Thread t1 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t1");
        Thread t2 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"获取到的对象是："+ Singleton.getInstance())
                ,"线程t2");
        t1.start();
        t2.start();

    }
}
