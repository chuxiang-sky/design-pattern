package com.chuxiang.java.creational.abstractFactory;

import com.chuxiang.java.creational.abstractFactory.othherProduct.OtherProduct;
import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/21.
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        OtherProduct otherProduct = factory.createOtherProduct();
        product.printName();
        otherProduct.printName();

        factory = new ConcreteFactoryB();
        product = factory.createProduct();
        otherProduct = factory.createOtherProduct();
        product.printName();
        otherProduct.printName();

        factory = new ConcreteFactoryC();
        product = factory.createProduct();
        otherProduct = factory.createOtherProduct();
        product.printName();
        otherProduct.printName();
    }
}
