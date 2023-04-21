package DesignPattern.factory.practice.NvWa;

/**
 * @Description:
 * @Date:2023-03-28-15:25
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactoryImpl();
        Person w = personFactory.getInstance("W");
        Person m = personFactory.getInstance("M");
        System.out.println("`````````````````````````````````");
        w.speak();
        m.speak();
    }
}

interface Person {

    public void speak();
}

class Men implements Person {
    public Men() {
        System.out.println("一个男人被创造");
    }

    @Override
    public void speak() {
        System.out.println("我是一个男人");
    }
}

class Women implements Person {
    public Women() {
        System.out.println("一个女人被创造");
    }

    @Override
    public void speak() {
        System.out.println("我是一个女人");
    }
}


interface PersonFactory {
    public Person getInstance(String type);
}

class PersonFactoryImpl implements PersonFactory {

    @Override
    public Person getInstance(String type) {
        if ("W".equalsIgnoreCase(type)) {
            return new Women();
        } else if ("M".equalsIgnoreCase(type)) {
            return new Men();
        } else {
            return null;
        }
    }
}
