package com.chuxiang.java.creational.builder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public interface ComputerBuilder {
    void buildeType();
    void buildeProcessor();
    void buildeMemoryCapacity();
    void buildeHardDriveCapacity();
    void buildeDisplayScreen();
    Computer show();
}
