package com.chuxiang.java.creational.builder;

/**
 * Created by chuxiang_sky on 2019/03/24.
 */
public class Computer {

    private String type;
    private String processor;
    private String memoryCapacity;
    private String hardDriveCapacity;
    private String displayScreen;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(String hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getDisplayScreen() {
        return displayScreen;
    }

    public void setDisplayScreen(String displayScreen) {
        this.displayScreen = displayScreen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", processor='" + processor + '\'' +
                ", memoryCapacity='" + memoryCapacity + '\'' +
                ", hardDriveCapacity='" + hardDriveCapacity + '\'' +
                ", displayScreen='" + displayScreen + '\'' +
                '}';
    }
}
