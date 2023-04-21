package DesignPattern.factory.practice.KongTiao;

/**
 * @Description:
 * @Date:2023-03-31-10:21
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        AirCondition1Factory airCondition1Factory = new AirCondition1Factory();
        AirCondition instance = airCondition1Factory.createInstance();
        instance.doSomething();
    }
}
