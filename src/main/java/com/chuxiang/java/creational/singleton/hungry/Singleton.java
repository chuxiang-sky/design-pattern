package com.chuxiang.java.creational.singleton.hungry;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 饿汉式单例：在类加载时就创建了该类的实例
 * 优点：不会有线程安全的问题，因为该对象实例化是在类加载过程中
 * 缺点：1、如果对象实例不会被使用，就会造成占用系统资源（堆内存）
 *       2、可以利用反射技术去破坏单例
 */
public class Singleton {
    private Singleton(){}

    private static final Singleton INSTANCE = new Singleton();//final修饰变量后只会初始化赋值一次

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
