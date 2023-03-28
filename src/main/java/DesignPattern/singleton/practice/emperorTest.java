package DesignPattern.singleton.practice;

/**
 * @Description:使用皇帝的例子来实现单例模式
 * @Date:2023-03-21-14:41
 * @author:Esan
 */
public class emperorTest {
    public static void main(String[] args) {

        emperor4 instance1 = emperor4.getInstance("小白");
        System.out.println(instance1.hashCode());

        emperor4 instance2 = emperor4.getInstance("白");
        System.out.println(instance2.hashCode());
//        emperor3 eih1 = emperor3.getInstance("eih" + 1);
//        System.out.println(eih1);
//
//        emperor3 eih2 = emperor3.getInstance("eih" + 2);
//        System.out.println(eih2);
////
//        for (int i = 0; i < 100; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    emperor3 eih = emperor3.getInstance("eih");
//                    System.out.println(eih);
//                }
//            }).start();
//        }

    }
}

enum emperor4 {
    emperor4(null);
    private String name;

    private  emperor4(String name) {
        this.name = name;
    }

    public static emperor4 getInstance(String name) {
        if (emperor4.name == null){
            emperor4.name=name;
        }
        return emperor4;
    }

    @Override
    public String toString() {
        return "emperor4{" +
                "name='" + name + '\'' +
                '}';
    }
}

class emperor3 {
    private String name;

    private emperor3() {
    }

    public static emperor3 getInstance(String name) {
        emperor3 instance = inneremp3.emperor3;
        if (instance.name == null) {
            instance.name = name;
        }
        return instance;
    }

    public static class inneremp3 {
        private static final emperor3 emperor3 = new emperor3();
    }

    @Override
    public String toString() {
        return "emperor3{" +
                "name='" + name + '\'' +
                '}';
    }
}

class emperor2 {
    private String name;
    private static volatile emperor2 emperor2;

    private emperor2(String name) {
        this.name = name;
    }

    public static emperor2 getInstance(String name) {
        if (emperor2 == null) {
            synchronized (emperor2.class) {
                emperor2 = new emperor2(name);
            }
        }
        return emperor2;
    }

    @Override
    public String toString() {
        return "emperor2{" +
                "name='" + name + '\'' +
                '}';
    }
}


class emperor1 {
    private String name;
    private static emperor1 emperor;

    public emperor1(String name) {
        this.name = name;
    }

    public static synchronized emperor1 getInstance(String name) {
        if (emperor == null) {
            emperor = new emperor1(name);
        }
        return emperor;
    }

    @Override
    public String toString() {
        return "emperor{" +
                "name='" + name + '\'' +
                '}';
    }
}
