package principle.lsp;

import principle.lsp.mytest.Animal;

public class LSPtest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setFlySpeed(120);
        bird2.setFlySpeed(120);
        System.out.println("如果飞行300千米");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时");
        } catch (Exception err) {

            System.out.println("出错误了!");
        }
    }
}

//鸟
class Bird extends Animal {
    double flySpeed;

    public void setFlySpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}

//燕子
class Swallow extends Bird {
}

//几维鸟
class BrownKiwi extends Bird {
    @Override
    public void setFlySpeed(double speed) {
        flySpeed = 0;
    }
}
