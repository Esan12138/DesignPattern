package DesignPattern.Proxy.DyncmicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Date:2023-05-09-14:11
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        CaculatorImpl caculator = new CaculatorImpl();
        Caculator ProxyCaculator = (Caculator) Proxy.newProxyInstance(caculator.getClass().getClassLoader(),
                                                                        caculator.getClass().getInterfaces(),
                                                                        new MyCaculator());

        ProxyCaculator.add(1, 2);
        System.out.println("```````````````````````");
        ProxyCaculator.sub(2, 3);
        System.out.println("`````````````````````");

    }
}

interface Caculator {
    void add(int a, int b);
    void sub(int a,int b);
}

class CaculatorImpl implements Caculator {

    @Override
    public void add(int a, int b) {
        System.out.println("sum=" + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("sub="+(a-b));
    }
}

class MyCaculator implements InvocationHandler {
    private Caculator caculator;

    public MyCaculator() {
        this.caculator = new CaculatorImpl();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before " + method.getName());
        Object result = method.invoke(caculator, args);
        System.out.println("After " + method.getName());
        return result;
    }
}
