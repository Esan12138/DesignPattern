package DesignPattern.Proxy.exercise2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Time;
import java.time.LocalDateTime;

/**
 * @Description:
 * @Date:2023-05-12-10:08
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        DAO oadao = new OADAO();
        DAO proxy = MyProxy.createProxy(oadao);
        proxy.add(1,2);
        System.out.println("-----------------------");
        proxy.sub(2,1);
    }
}

interface DAO {
    public void add(int a, int b);

    public void sub(int a, int b);
}

class OADAO implements DAO {

    @Override
    public void add(int a, int b) {
        System.out.println("OADAO的add方法内部结果为：" + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("OADAO的sub方法内部，结果为：" + (a - b));
    }
}

class MyProxy implements InvocationHandler {
    private Object tar;

    private MyProxy(Object tar) {
        this.tar = tar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[日志]开始调用" + method.getName() + "此时的时间为：" + LocalDateTime.now());
        Object invoke = method.invoke(tar, args);
        System.out.println("[日志]方法调用结束");
        return invoke;
    }

    public static <T> T createProxy(T target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, new MyProxy(target));
    }
}
