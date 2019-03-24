package com.chuxiang.java.creational.singleton.hungry;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class SingletonWithoutReflect {
    private SingletonWithoutReflect(){
        //为了避免通过反射破坏单例，当已实例化后，再次调用构造方法直接抛出异常
        if(INSTANCE != null){
            throw new RuntimeException("单例已存在，无法再次实例化");
        }
    }

    private static final SingletonWithoutReflect INSTANCE = new SingletonWithoutReflect();

    public static SingletonWithoutReflect getInstance(){
        return INSTANCE;
    }
}
