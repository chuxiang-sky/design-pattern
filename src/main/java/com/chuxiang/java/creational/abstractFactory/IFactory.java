package com.chuxiang.java.creational.abstractFactory;

import com.chuxiang.java.creational.abstractFactory.othherProduct.OtherProduct;
import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/21.
 * 创建型设计模式
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 * 优点：工厂方法模式的升级版，符合设计模式的开闭原则，利于扩展
 * 缺点：若增加产品类型，需要新增多个产品具体实现类，同时在IFactory中新增加方法，且该抽象工厂的实现工厂也得实现增加的方法
 */
public interface IFactory {

    Product createProduct();

    OtherProduct createOtherProduct();
}
