package com.chuxiang.java.creational.abstractFactory;

import com.chuxiang.java.creational.abstractFactory.othherProduct.ConcreteOtherProductA;
import com.chuxiang.java.creational.abstractFactory.othherProduct.ConcreteOtherProductC;
import com.chuxiang.java.creational.abstractFactory.othherProduct.OtherProduct;
import com.chuxiang.java.creational.factory.product.ConcreteProductA;
import com.chuxiang.java.creational.factory.product.ConcreteProductC;
import com.chuxiang.java.creational.factory.product.Product;

/**
 * Created by chuxiang_sky on 2019/03/21.
 */
public class ConcreteFactoryC implements IFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductC();
    }

    @Override
    public OtherProduct createOtherProduct() {
        return new ConcreteOtherProductC();
    }
}
