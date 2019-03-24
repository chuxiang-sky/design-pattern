package com.chuxiang.java.creational.singleton.enumeration;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE.getInstance();
        System.out.println("对象s1："+s1);
        Singleton s2 = Singleton.INSTANCE.getInstance();
        System.out.println("对象s2："+s2);
        System.out.println("s1==s2："+(s1==s2));
    }
}
