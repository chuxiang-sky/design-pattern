package com.chuxiang.java.creational.singleton.lazy;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 懒汉式单例：第一次引用对象时，才会实例化
 * 优点：节省了内存资源
 * 缺点：存在线程安全性问题
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}
