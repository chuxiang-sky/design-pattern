package com.chuxiang.java.structural.adapter;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 结构型设计模式
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 两个不同类型的类Target和Adaptee，需要将Target的某个逻辑实现转换成Adaptee的某个逻辑，
 * 则可以创建一个适配器Adapter去继承Target，并在这个适配器接口中持有Adaptee的引用
 * 在适配器Adapter中重写需要使用Target的某个方法，在这个重写的方法中调用Adaptee的方法
 */
public class Translate extends English {

    private Chinese chinese = new Chinese();

    @Override
    public void helloworldByEnglish() {
        chinese.helloworldByChinese();
    }
}
