package DesignPattern.Proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:jdk动态代理
 * @Date:2023-05-09-14:33
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Ibuy buyer = (Ibuy) Proxy.newProxyInstance(Buyer.class.getClassLoader(), Buyer.class.getInterfaces(), new MyProxy());
        buyer.pay();
    }
}

interface Ibuy {
    String pay();
}

class Buyer implements Ibuy {
    @Override
    public String pay() {
        System.out.println("顾客付款");
        return "付款完成";
    }
}

class MyProxy implements InvocationHandler {
    private Buyer buyer;

    public MyProxy() {
        this.buyer = new Buyer();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before " + method.getName());
        Object res = method.invoke(buyer, args);
        System.out.println("after " + method.getName());
        System.out.println("invoke的返回值:"+res);
        return res;
    }

}
