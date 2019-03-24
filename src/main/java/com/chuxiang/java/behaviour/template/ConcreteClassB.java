package com.chuxiang.java.behaviour.template;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void operation1() {
        System.out.println("call method operation1 of ConcreteClassB");
    }

    @Override
    protected void operation2() {
        System.out.println("call method operation2 of ConcreteClassB");

    }
}
