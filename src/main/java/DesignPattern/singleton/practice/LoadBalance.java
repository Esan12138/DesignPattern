package DesignPattern.singleton.practice;

/**
 * @Description:
 * @Date:2023-03-17-10:29
 * @author:Esan
 */
public class LoadBalance {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("开启一个新线程：" + Thread.currentThread().getName());
                SingleTon instance1 = SingleTon.getInstance1();
                System.out.println(instance1);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("开启一个新线程：" + Thread.currentThread().getName());
                SingleTon instance1 = SingleTon.getInstance2();
                System.out.println(instance1);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("开启一个新线程：" + Thread.currentThread().getName());
                SingleTon instance1 = SingleTon.getInstance3();
                System.out.println(instance1);
            }
        }).start();

    }
}

class SingleTon {
    private static volatile SingleTon instance;

    private SingleTon() {
    }

    public static SingleTon getInstance1() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    public static synchronized SingleTon getInstance2() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    public static SingleTon getInstance3() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
