package DesignPattern.singleton.hungry;

/**
 * @Description:
 * @Date:2023-03-24-9:36
 * @author:Esan
 */
public class HungrySingleton {
    public static void main(String[] args) {
        Singleton1 xiaobai1 = Singleton1.getInstance("xiaobai");
        Singleton1 xiaobai2 = Singleton1.getInstance("xi");

        Singleton2 x1 = Singleton2.getInstance("xbai");
        Singleton2 x2 = Singleton2.getInstance("xxi");

        System.out.println(xiaobai1);
        System.out.println(xiaobai2);
        System.out.println(x1);
        System.out.println(x2);
    }
}


/**
 * 通过静态代码块的方式
 */
class Singleton1 {
    public static final Singleton1 instance;

    static {
        instance = new Singleton1(null);
    }

    private String name;

    private Singleton1(String name) {
        this.name = name;
    }

    public static Singleton1 getInstance(String name) {
        if (instance.name==null){
            instance.name=name;
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton1{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * 通过成员变量赋初值
 */
class Singleton2 {
    public static final Singleton2 instance = new Singleton2(null);

    private String name;

    private Singleton2(String name) {
        this.name = name;
    }

    public static Singleton2 getInstance(String name) {
        if (instance.name == null) {
            instance.name = name;
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton2{" +
                "name='" + name + '\'' +
                '}';
    }
}