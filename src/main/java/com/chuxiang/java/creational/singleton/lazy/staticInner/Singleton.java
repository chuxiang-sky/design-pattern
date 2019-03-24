package com.chuxiang.java.creational.singleton.lazy.staticInner;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 懒汉式单例-静态内部类形态：吸取了饿汉式单例的优点，利用了类加载机制和静态内部类的特性
 */
public class Singleton {

    private Singleton(){}

    public static Singleton getInstance(){
        return Inner.INNER_INSTANCE;
    }

    private static class Inner{
        private static final Singleton INNER_INSTANCE = new Singleton();
    }
}
