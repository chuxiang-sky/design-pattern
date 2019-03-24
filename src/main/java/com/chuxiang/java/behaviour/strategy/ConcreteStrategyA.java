package com.chuxiang.java.behaviour.strategy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("call method doSomething of ConcreteStrategyA");
    }
}
