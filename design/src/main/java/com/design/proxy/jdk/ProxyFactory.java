package com.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lssemail on 2018/1/18.
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class ProxyFactory {

    private Object target;
    public ProxyFactory(Object object){
        this.target = object;
    }

    public Object getProxyInstance(){

        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    System.out.println("执行目标对象方法");
                    //执行目标对象方法
                    Object returnObj = method.invoke(target, args);

                    System.out.println("目标对象执行完毕了");

                    return returnObj;
                }
            }
        );
    }
}
