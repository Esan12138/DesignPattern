package DesignPattern.adapter.demo2;

/**
 * @Description:类适配器
 * @Date:2023-04-14-10:29
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.add(1, 2));
    }
}

interface IMath {
    int add(int a, int b);
}
class MyMath extends Third implements IMath {
    @Override
    public int add(int a, int b) {
        return this.addFunction(a, b);
    }
}
class Third {
    int addFunction(int a, int b){
        return a+b;
    }
}