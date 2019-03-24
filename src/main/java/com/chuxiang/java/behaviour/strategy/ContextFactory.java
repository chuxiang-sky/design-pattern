package com.chuxiang.java.behaviour.strategy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class ContextFactory {

    private IStrategy strategy;

    public ContextFactory(String strategyType){
        switch(strategyType){
            case "A":this.strategy = new ConcreteStrategyA();break;
            case "B":this.strategy = new ConcreteStrategyB();break;
            default:throw new RuntimeException("Please select one strategy");
        }
    }


    public void selectStrategy(){
        strategy.doSomething();
    }
}
