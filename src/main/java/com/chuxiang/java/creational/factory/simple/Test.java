package com.chuxiang.java.creational.factory.simple;


import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/19.
 */
public class Test {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product = factory.createProduct("A");
        product.printName();
        product = factory.createProduct("B");
        product.printName();
    }
}
