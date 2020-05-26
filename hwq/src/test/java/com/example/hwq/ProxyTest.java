package com.example.hwq;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void testJdkProxy() {
        final People people=new People();
        PeopleInterface proxy=(PeopleInterface) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                People.class.getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理前");
                        Object result=method.invoke(people, args);
                        System.out.println("代理后");
                        return result;
                    }
                });

        String result=proxy.getInfo(18);
        System.out.println("执行结果："+result);
    }
}
class People implements PeopleInterface{

    public String getInfo(int age){
        System.out.println("执行中--张三的年龄："+age);
        return "张三的年龄："+age;
    }
}
interface PeopleInterface {

    public String getInfo(int age);
}


