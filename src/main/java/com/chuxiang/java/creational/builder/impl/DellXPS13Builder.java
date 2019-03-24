package com.chuxiang.java.creational.builder.impl;

import com.chuxiang.java.creational.builder.Computer;
import com.chuxiang.java.creational.builder.ComputerBuilder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class DellXPS13Builder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildeType() {
        computer.setType("XPS 13-9380-D1505S");
    }

    @Override
    public void buildeProcessor() {
        computer.setProcessor("Intel 酷睿i5 8265U");
    }

    @Override
    public void buildeMemoryCapacity() {
        computer.setMemoryCapacity("8GB LPDDR3 2133");
    }

    @Override
    public void buildeHardDriveCapacity() {
        computer.setHardDriveCapacity("256GB PCIe SSD");
    }

    @Override
    public void buildeDisplayScreen() {
        computer.setDisplayScreen("13.3英寸 1920x1080");
    }

    @Override
    public Computer show() { return this.computer; }
}
