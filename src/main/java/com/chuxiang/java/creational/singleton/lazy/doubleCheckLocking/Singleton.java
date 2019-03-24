package com.chuxiang.java.creational.singleton.lazy.doubleCheckLocking;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 懒汉式单例-双重检查锁（Double Check Locking）形态:理论上进一步解决同步锁懒汉式单例中被加锁的类中其它方法不能使用的问题
 * 实际上双重检查锁是一个错误的用法，可参考《Java并发编程的艺术》中第3.8节内容
 * 原因如下：
 * instance = new Singleton()在JVM中可被分拆成如下三行伪代码：
 * memory = allocate();     //1:分配对象的内存空间
 * ctorInstance(memory);    //2:初始化对象
 * instance = memory;       //3:设置instance指向刚分配的内存地址
 * 其中2和3之间可能会被重排序，重排序后如下：
 * memory = allocate();     //1:分配对象的内存空间
 * instance = memory;       //3:设置instance指向刚分配的内存地址，但此时对象还没有被初始化！
 * ctorInstance(memory);    //2:初始化对象
 * 这种重排序在没有改变单线程程序执行结果的前提下，可以提高程序的性能，所以是被允许的
 *
 * 为了解决这个问题，可以有两种解决方案：
 * 一、不允许2和3重排序，即把instance声明为volatile型
 * 二、允许2和3重排序，但不允许其他线程“看到”这个重排序，即使用静态内部类的类初始化特性
 *      JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。
 *      在执行初始化期间，JVM会去获取一个锁，这个锁可以同步多个线程对同一个类的初始化
 *      示例代码见com.chuxiang.java.creational.singleton.lazy.staticInner.Singelton.java
 */
public class Singleton {

    //private static Singleton instance = null;//可能会出现异常
    private volatile static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){//第一个if判断语句是为了减少线程间锁的竞争
            synchronized (Singleton.class){
                if(instance==null){//第二个if条件判断语句是当多个线程都通过上一个if条件判断语句时，在没有判断实例对象是否存在时直接实例化对象
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
