package com.chuxiang.java.creational.singleton.enumeration;

/**
 * Created by chuxiang_sky on 2019/03/20.
 * 创建型设计模式
 * 单例模式：保证一个类仅有一个实例（只有一个私有的无参构造方法），并提供一个该实例的全局访问点
 * 单元素枚举:最佳实践方案，避免了反射攻击和复杂序列化
 * 为什么要用枚举实现单例模式呢？可参考《Effective Java》
 * 1、私有化构造函数并不保险，示例代码可见com.chuxiang.java.creational.singleton.hungry
 * 2、单例对象序列化前后的对象不相等
 * 3、
 */
public enum Singleton {
    INSTANCE;
    public Singleton getInstance(){
        return INSTANCE;
    }
}
