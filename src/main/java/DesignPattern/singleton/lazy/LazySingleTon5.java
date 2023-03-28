package DesignPattern.singleton.lazy;

/**
 * 单例模式的最佳写法
 *
 * @Description:通过枚举类实现单例模式
 * @Date:2023-03-17-11:21
 * @author:Esan
 */
public enum LazySingleTon5 {
    INSTANCE;

    int age;

    public static LazySingleTon5  getInstance() {
        return INSTANCE;
    }

}
