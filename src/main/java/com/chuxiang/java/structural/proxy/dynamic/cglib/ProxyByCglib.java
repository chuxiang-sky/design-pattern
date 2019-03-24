package com.chuxiang.java.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by chuxiang_sky on 2019/03/24.
 * 结构型设计模式
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问（功能增强，例如AOP，事务）
 * 动态代理-cglib形式：被代理的对象没有实现需要的接口
 * 1、定义了一个被代理类Subject没有实现需要的接口，
 * 2、定义一个实现了net.sf.cglib.proxy.MethodInterceptor接口的代理类Proxy，同时持有被代理类的实例对象（可不需要持有被代理类的实例对象引用）
 * 3、在代理类Proxy中通过net.sf.cglib.proxy.Enhancer创建一个继承被代理类的实例对象，
 * 4、重写net.sf.cglib.proxy.MethodInterceptor#intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)方法，
 * 5、再通过反射机制调用net.sf.cglib.proxy.MethodProxy#invokeSuper(Object obj, Object[] args)，传入intercept方法中的Object o和Object[] objects
 * 6、实现了对被代理类的所有方法的动态代理，不需要像JDK动态代理中必须要求被代理类需要实现接口
 */
public class ProxyByCglib implements MethodInterceptor {

    private Object target;

    public ProxyByCglib(Object target) {
        this.target = target;
    }

    public Object createProxy(){
        Enhancer enhancer = new Enhancer();//创建一个Enchancer实例对象
        enhancer.setSuperclass(target.getClass());//设置创建的代理对象的父类
        enhancer.setCallback(this);//设置创建的代理对象的回调对象
        return enhancer.create();//创建代理对象
    }

    /*
    * 参数说明：
    * 前三个参数与jdk中InvocationHandler中的Invoke相同：
    * Object o：cglib生成的代理对象
    * Method method：被代理对象方法 
    * Object[] objects：方法调用时所需要的参数 
    * MethodProxy methodProxy： JDK的java.lang.reflect.Method类的代理类，可以实现对源对象方法的调用。
    * */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before intercepting");
//        Object obj = method.invoke(target,objects);
        Object obj = methodProxy.invokeSuper(o,objects);//调用代理对象的父类（即被代理对象）方法
        System.out.println("after intercepting");
        return obj;
    }
}
