package DesignPattern.singleton.practice;

/**
 * @Description:
 * @Date:2023-03-31-11:40
 * @author:Esan
 */
public class Test {
    public static void main(String[] args) {
        AmericanPresident instance1 = AmericanPresident.getInstance("林肯");
        System.out.println(instance1);

        AmericanPresident instance2 = AmericanPresident.getInstance("特朗普");
        System.out.println(instance2);
    }
}

class AmericanPresident {
    private String name;
    private static volatile AmericanPresident instance;

    private AmericanPresident(String name) {
        this.name = name;
    }

    public static AmericanPresident getInstance(String name) {
        if (instance == null){
            synchronized (AmericanPresident.class){
                if(instance==null){
                   return instance=new AmericanPresident(name);
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AmericanPresident{" +
                "name='" + name + '\'' +
                '}';
    }
}
