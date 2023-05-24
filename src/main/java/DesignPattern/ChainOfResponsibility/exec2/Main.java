package DesignPattern.ChainOfResponsibility.exec2;

import org.reflections.Reflections;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @Description:使用自定义注解、责任链模式完成练习
 * @Date:2023-05-19
 * @author:Esan
 */


public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Chain chain = new Chain();
        chain.createChain();
        chain.dowork(-1);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyHandlerOrder {
    int value() default 0;
}

class Chain {
    List<Handler> handlerList = new ArrayList<>();

    public void createChain() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //1.获取所有标识了 自定义注解的 class类
        List<Class<?>> handlerClasses = getAllHandlerClasses();

        //2.排序
        Collections.sort(handlerClasses, new Comparator<Class<?>>() {
            @Override
            public int compare(Class<?> o1, Class<?> o2) {
                return o1.getAnnotation(MyHandlerOrder.class).value() - o2.getAnnotation(MyHandlerOrder.class).value();
            }
        });

        //3.设置处理链
        for (Class<?> handlerClass : handlerClasses) {
            Constructor<?> constructor = handlerClass.getConstructor();
            Handler handler = (Handler) constructor.newInstance();
            if (!handlerList.isEmpty()) {
                int size = handlerList.size();
                Handler lasthandler = handlerList.get(size - 1);
                lasthandler.setHandler(handler);
            }
            handlerList.add(handler);
        }

    }

    private List<Class<?>> getAllHandlerClasses() {
        Reflections reflections = new Reflections("DesignPattern.ChainOfResponsibility.exec2");
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(MyHandlerOrder.class);
        List<Class<?>> ans = new ArrayList<Class<?>>(typesAnnotatedWith);
        return ans;
    }

    public void dowork(int req) {
        if (!handlerList.isEmpty()) {
            handlerList.get(0).handleRequest(req);
        }
    }

}

abstract class Handler {
    protected Handler successor;

    public void setHandler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

@MyHandlerOrder(3)
class ConcreteHandlerA extends Handler {
    public ConcreteHandlerA() {

    }

    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("组长处理了请假事件");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

@MyHandlerOrder(2)
class ConcreteHandlerB extends Handler {
    public ConcreteHandlerB() {

    }

    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("项目经理处理了请假事件");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

@MyHandlerOrder(1)
class ConcreteHandlerC extends Handler {
    public ConcreteHandlerC() {
    }

    @Override
    public void handleRequest(int request) {
        if (request > 2) {
            System.out.println("总经理处理了请假事件");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

@MyHandlerOrder(4)
class MytestHandler extends Handler {
    public MytestHandler() {
    }

    @Override
    public void handleRequest(int request) {
        if(request<0){
            System.out.println("MytestHandler");
        }else{
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}