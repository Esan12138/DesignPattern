package DesignPattern.adapter.demo1;

/**
 * @Description:使用的对象适配器
 * @Date:2023-04-14-10:29
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(new Third());
        int add = myMath.add(1, 2);
        System.out.println(add);
    }

}
interface IMath {
    int add(int a, int b);
}

class MyMath implements IMath {
    protected Third third;

    public MyMath(Third third) {
        this.third = third;
    }

    @Override
    public int add(int a, int b) {
        return third.addFunction(a,b);
    }
}
class Third {
    int addFunction(int a, int b){
        return a+b;
    }
}