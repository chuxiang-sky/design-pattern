package com.chuxiang.java.creational.builder.impl;

import com.chuxiang.java.creational.builder.Computer;
import com.chuxiang.java.creational.builder.ComputerBuilder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class MacBookProBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildeType() { computer.setType("MacBook Pro"); }

    @Override
    public void buildeProcessor() { computer.setProcessor("第七代酷睿i5"); }

    @Override
    public void buildeMemoryCapacity() { computer.setMemoryCapacity("8GB LPDDR3 2133"); }

    @Override
    public void buildeHardDriveCapacity() { computer.setHardDriveCapacity("128GB SSD"); }

    @Override
    public void buildeDisplayScreen() { computer.setDisplayScreen("13.3英寸 2560x1600"); }

    @Override
    public Computer show() { return this.computer; }
}
