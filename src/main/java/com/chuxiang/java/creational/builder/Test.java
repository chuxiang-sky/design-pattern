package com.chuxiang.java.creational.builder;

import com.chuxiang.java.creational.builder.impl.DellXPS13Builder;
import com.chuxiang.java.creational.builder.impl.MacBookProBuilder;
import com.chuxiang.java.creational.builder.impl.MatebookXProBuilder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 创建型设计模式
 * 建造者模式：将一个复杂对象的构件与他的表示分离，使得同样的构建过程可以创建不同的表示
 * 主要用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder computerBuilder = new MatebookXProBuilder();
        director.construct(computerBuilder);
        Computer computer = computerBuilder.show();
        System.out.println(computer);

        computerBuilder = new MacBookProBuilder();
        director.construct(computerBuilder);
        computer = computerBuilder.show();
        System.out.println(computer);

        computerBuilder = new DellXPS13Builder();
        director.construct(computerBuilder);
        computer = computerBuilder.show();
        System.out.println(computer);
    }
}
