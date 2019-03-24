package com.chuxiang.java.behaviour.strategy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 行为型设计模式
 * 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户
 *
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void selectStrategy(){
        strategy.doSomething();
    }
}
