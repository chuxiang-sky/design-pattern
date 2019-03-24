package com.chuxiang.java.creational.factory.simple;

import com.chuxiang.java.creational.factory.product.ConcreteProductA;
import com.chuxiang.java.creational.factory.product.ConcreteProductB;
import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/19.
 * 创建型设计模式
 * 简单工厂模式：定义一个工厂类，根据传递的参数的不同创建不同的实例，这些实例通常都有实现同一接口或继承了同一父类
 * 优点：工厂类（ProductFactory）中包含了必要的逻辑判断，根据传入的参数动态实例化相关的类
 * 缺点：违背了开闭原则（对扩展开发，对修改关闭）
 */
public class ProductFactory {

    public Product createProduct(String name) {
        Product product = null;
        if ("A".equals(name)) {
            product = new ConcreteProductA();
        } else if ("B".equals(name)) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
