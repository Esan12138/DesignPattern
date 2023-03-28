package DesignPattern.singleton.lazy;

import java.io.Serializable;

/**
 * @Description: 通过 内部静态类 的方式
 *              是通过jvm来保证线程安全的
 *             注意：使用此方法，如果要序列化和反序列化对象，需要自行添加readResolve方法返回原来的单一实例，不然默认返回的是新创建的一个对象
 * @Date:2023-03-17-11:03
 * @author:Esan
 */
public class LazySingleTon4 implements Serializable {
    private LazySingleTon4() {
    }

    /**
     * 外部类加载的时候并不会加载内部类，只有在内部类被调用的时候才会被加载，并且只会被加载一次
     */

    public static class LazySingleTon {
        private static final LazySingleTon4 INSTANCE = new LazySingleTon4();
    }

    public static LazySingleTon4 getInstance() {
        return LazySingleTon.INSTANCE;
    }


    private LazySingleTon4 readResolve() {
        return LazySingleTon4.getInstance();
    }
}
