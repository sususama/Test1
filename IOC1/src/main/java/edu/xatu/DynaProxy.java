package edu.xatu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class DynaProxy implements InvocationHandler {
    private Object target;//目标对象
    public DynaProxy(Object target){
        this.target=target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Ser ser=new Ser();
        ser.chuanyifu();
        ser.xishu();
        ser.chifan();
        return method.invoke(target,args);
    }
    public Object createProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);

    }
}
