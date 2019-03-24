package com.chuxiang.java.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 结构型设计模式
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问（功能增强，例如AOP，事务）
 * 动态代理-JDK形式：被代理的对象实现了需要的接口
 * 1、定义了一个共用接口ISubject，被代理类SubjectImpl都实现了该接口，
 * 2、定义一个实现了java.lang.reflect.InvocationHandler接口的代理类Proxy，同时持有被代理类的实例对象
 * 3、在代理类Proxy中通过java.lang.reflect.Proxy#newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)创建一个代理类的实例对象，
 * 4、重写java.lang.reflect.InvocationHandler#invoke(Object proxy, Method method, Object[] args)方法，
 * 5、再通过JDK反射机制调用java.lang.reflect.Method#invoke(Object obj, Object... args)，形参传入被代理的实例对象和参数
 * 6、实现了对被代理接口的所有方法的动态代理，不需要像静态代理中需要对接口中每个方法重写
 */
public class ProxyByJdk implements InvocationHandler {

    private Object target;

    public ProxyByJdk(Object target) {
        this.target = target;
    }

    /*
    * 参数说明：
    * ClassLoader loader：类加载器
    * Class<?>[] interfaces：全部的接口
    * InvocationHandler h：InvocationHandler接口的实现类对象
    * */
    public Object createProxyByJdk(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /*
    * 参数说明：
    * Object proxy：指代理的对象。
    * Method method：要调用的方法
    * Object[] args：方法调用时所需要的参数
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before request");
        Object obj = method.invoke(target,args);//调用被代理对象的方法
        System.out.println("after request");
        return obj;
    }
}
