package com.chuxiang.java.creational.builder.impl;

import com.chuxiang.java.creational.builder.Computer;
import com.chuxiang.java.creational.builder.ComputerBuilder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class MatebookXProBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildeType() {
        computer.setType("Hua Wei Matebook X Pro");
    }

    @Override
    public void buildeProcessor() {
        computer.setProcessor("Intel Core i7-8550U(1.8GHz/L3 8M)");
    }

    @Override
    public void buildeMemoryCapacity() {
        computer.setMemoryCapacity("8GB DDR4");
    }

    @Override
    public void buildeHardDriveCapacity() {
        computer.setHardDriveCapacity("512GB SSD");
    }

    @Override
    public void buildeDisplayScreen() {
        computer.setDisplayScreen("13.3英寸 3000x2000");
    }

    @Override
    public Computer show() { return this.computer; }
}
