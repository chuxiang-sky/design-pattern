package com.chuxiang.java.creational.singleton.lazy.synchronize;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 懒汉式单例-同步锁形态：为了解决一般懒汉式单例的线程安全问题，用同步锁关键字synchronized修饰getInstance()
 * 优点：没有线程安全问题
 * 缺点：因为静态方法增加了synchronized同步锁，会将整个对象锁住，无法使用该类的其他方法
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}
