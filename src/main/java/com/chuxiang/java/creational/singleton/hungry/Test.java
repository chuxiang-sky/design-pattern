package com.chuxiang.java.creational.singleton.hungry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by chuxiang_sky on 2019/03/20.
 */
public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println("对象s1为:"+s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println("对象s2为:"+s2);

        System.out.println("s1==s2:"+(s1==s2));//预测为true

        //下面利用反射来破坏单例
        Class singletonClazz = Singleton.class;
        Singleton s3 = null;
        try {
            Constructor constructor = singletonClazz.getDeclaredConstructor();//获取当前Class所表示类中指定的一个的构造器,和访问权限无关
            constructor.setAccessible(true);//设置私有方法的可访问（切记，这里必须设置，否则会抛出异常）
            s3 = (Singleton)constructor.newInstance();//实例化对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("对象s3为:"+s3);
        System.out.println("s2==s3:"+(s2==s3));//预测为false

        SingletonWithoutReflect swr = SingletonWithoutReflect.getInstance();
        Class singletonWithoutReflectClazz = swr.getClass();
        SingletonWithoutReflect swr1 = null;
        try {
            Constructor constructor1 = singletonWithoutReflectClazz.getDeclaredConstructor();//获取当前Class所表示类中指定的一个的构造器,和访问权限无关
            constructor1.setAccessible(true);//设置私有方法的可访问（切记，这里必须设置，否则会抛出异常）
            swr1 = (SingletonWithoutReflect)constructor1.newInstance();//实例化对象，此处会抛出异常
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
