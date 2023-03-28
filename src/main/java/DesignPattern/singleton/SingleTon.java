package DesignPattern.singleton;

/**
 * @Description:
 * @Date:2023-03-14-15:04
 * @author:Esan
 */
public class SingleTon {
    /**
     * 声明静态私有变量，用于保存实例
     */
    private static SingleTon instance;

    /**
     * 声明私有构造方法，防止外部创建
     */
    private SingleTon(){}

    /**
     * 声明公共静态方法，用于获取单实例对象
     */
    public static SingleTon getInstance(){
        if(instance==null){
            return new SingleTon();
        }
        return instance;
    }

}

class Main{
    public static void main(String[] args) {
//        SingleTon instance1 = SingleTon.getInstance();
//        SingleTon instance2 = SingleTon.getInstance();
//        System.out.println(instance2.equals( instance2));

    }
}
