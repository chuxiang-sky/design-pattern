package com.chuxiang.java.creational.builder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Director {

    public void construct(ComputerBuilder builder){
        builder.buildeType();
        builder.buildeProcessor();
        builder.buildeMemoryCapacity();
        builder.buildeHardDriveCapacity();
        builder.buildeDisplayScreen();
    }
}
