package com.cqust.ghb.agency;

import javax.swing.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 给所有dao创建代理对象{动态代理}
 * 代理对象，不需要实现jiek
 */
public class ProxyFactory {
    //维护目标
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    //给目标对象，生成代理对象  开闭原则：可拓展不可随意更改
    public Object getProxyInstance(){
        //返回的就是代理对象（三个参数）
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//获取加载器
                target.getClass().getInterfaces(),//获取该类实现的接口
                new InvocationHandler(){         //事件处理器 是一个接口，用内部类实现后作为参数传回去
                    @Override
                    public Object invoke(Object proxy, Method method,Object[] arg)throws Throwable{
                        System.out.println("我是谁？");
                        Object returnValue =method.invoke(target,arg);
                        System.out.println("要到哪里去？");
                        return returnValue;
                    }
                });
    }

}
