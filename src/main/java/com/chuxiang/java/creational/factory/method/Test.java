package com.chuxiang.java.creational.factory.method;

import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/19.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new ConcreteProductAFactory();
        Product product = factory.createProduct();
        product.printName();

        factory = new ConcreteProductBFactory();
        product = factory.createProduct();
        product.printName();

        factory = new ConcreteProductCFactory();
        product = factory.createProduct();
        product.printName();
    }
}
