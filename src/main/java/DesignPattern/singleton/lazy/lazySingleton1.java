package DesignPattern.singleton.lazy;

/**
 * @Description:
 * @Date:2023-03-17-8:46
 * @author:Esan
 */
public class lazySingleton1 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("run起来啦");
            }
        }).start();
    }

}

/**
 * 此方法是 懒汉式的双重检测
 */
class present1 {
    private volatile static present1 present;

    private present1() {

    }

    public static present1 getInstance() {
        if (present == null) {
            synchronized (present1.class) {
                if (present == null) {
                    present = new present1();
                }
            }
        }
        return present;
    }
}

class lazySingleton2 {
    private volatile static lazySingleton2 lazySingleton2;

    public static lazySingleton2 getInstance() {
        if (lazySingleton2 == null) {
            lazySingleton2 = new lazySingleton2();
        }

        return lazySingleton2;
    }
}
