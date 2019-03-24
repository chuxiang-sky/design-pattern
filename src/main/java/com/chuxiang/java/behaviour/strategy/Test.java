package com.chuxiang.java.behaviour.strategy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Test {

    public static void main(String[] args) {

        IStrategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.selectStrategy();

        strategy = new ConcreteStrategyB();
        context = new Context(strategy);
        context.selectStrategy();

        //策略模式和简单工厂模式的组合使用
        ContextFactory factory = new ContextFactory("A");
        factory.selectStrategy();
        factory = new ContextFactory("B");
        factory.selectStrategy();
        factory = new ContextFactory("C");
        factory.selectStrategy();
    }
}
