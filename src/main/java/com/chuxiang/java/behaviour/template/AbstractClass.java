package com.chuxiang.java.behaviour.template;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 行为型设计模式
 * 模板（方法）模式：定义一个操作中的算法的股价，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 * 应用场景：JDBC操作
 */
public abstract class AbstractClass {
    
    public void templateMethod(){
        System.out.println("call method templateMethod of Abstract");
        operation1();
        operation2();
    }

    protected abstract void operation1();
    protected abstract void operation2();
}
