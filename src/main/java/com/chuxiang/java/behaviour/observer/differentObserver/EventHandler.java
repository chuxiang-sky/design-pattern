package com.chuxiang.java.behaviour.observer.differentObserver;

import java.lang.reflect.Method;

/**
 * Created by chuxiang_sky on 2019/03/25.
 */
public class EventHandler {

    private Object obj;
    private Method method;
    private Object[] args;

    public EventHandler(Object obj, Method method, Object[] args) {
        this.obj = obj;
        this.method = method;
        this.args = args;
    }

    public Object getObj() {
        return obj;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArgs() {
        return args;
    }
}
