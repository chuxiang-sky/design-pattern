package com.chuxiang.java.creational.factory.method;

import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/19.
 * 创建型设计模式
 * 工厂方法模式：定义一个用于创建对象的抽象类（或接口），将某个类的实例化延迟到其子类（或实现类）中
 * 优点：符合设计模式的开闭原则，利于扩展
 * 缺点：将需要实例化某个类的逻辑交由客户端（调用方）进行选择
 */
public abstract class Factory {
    abstract Product createProduct();
}
