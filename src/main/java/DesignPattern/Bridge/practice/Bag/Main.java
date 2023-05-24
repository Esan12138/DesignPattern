package DesignPattern.Bridge.practice.Bag;

/**
 * @Description:
 * @Date:2023-04-28-10:21
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Bag wallet = new Wallet(new RedColor());
        wallet.getInfo();
        Bag handbag = new HandBag(new YellowColor());
        handbag.getInfo();
    }
}

interface Bag {
    void getInfo();
}

interface Color {
    public String getColor();
}

class RedColor implements Color {

    @Override
    public String getColor() {
        return "红色";
    }
}

class YellowColor implements Color {

    @Override
    public String getColor() {
        return "黄色";
    }
}

abstract class AbstractBag implements Bag {
    protected Color color;

    public AbstractBag(Color color) {
        this.color = color;
    }
}

class Wallet extends AbstractBag {

    public Wallet(Color color) {
        super(color);
    }

    public void getInfo() {
        System.out.println("钱包的颜色是：" + color.getColor());
    }
}

class HandBag extends AbstractBag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public void getInfo() {
        System.out.println("手提包的颜色是：" + color.getColor());
    }
}



