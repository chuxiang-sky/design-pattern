package com.chuxiang.java.creational.factory.method;

import com.chuxiang.java.creational.factory.product.ConcreteProductA;
import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/19.
 */
public class ConcreteProductAFactory extends Factory{
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
