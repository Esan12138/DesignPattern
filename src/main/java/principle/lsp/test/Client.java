package principle.lsp.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        //父类 基类
        A a=new A();
        A b=new B();
        System.out.println("基类fun执行的结果");
        a.fun(1,4);
        System.out.println("子类fun执行的结果");
        b.fun(1,4);

    }




}
