package DesignPattern.singleton.lazy;

/**
 * @Description:
 * @Date:2023-03-17-11:28
 * @author:Esan
 */
public class Test {
    public static void main(String[] args) {
        LazySingleTon5 instance = LazySingleTon5.getInstance();
        System.out.println(instance);
    }
}
