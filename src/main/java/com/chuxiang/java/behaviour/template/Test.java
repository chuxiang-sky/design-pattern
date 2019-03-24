package com.chuxiang.java.behaviour.template;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass template = new ConcreteClassA();
        template.templateMethod();

        template = new ConcreteClassB();
        template.templateMethod();
    }
}
