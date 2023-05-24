package DesignPattern.Proxy.demo1;

/**
 * @Description:
 * @Date:2023-05-05-10:27
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Buyer());
        proxy.find();
        proxy.dowork();
        proxy.pay();
    }
}

class Buyer {
    public void pay() {
        System.out.println("Buyer 付款");
    }
}

class Proxy {
    private Buyer buyer;

    public Proxy(Buyer buyer) {
        this.buyer = buyer;
    }

    public void find() {
        System.out.println("Proxy 找房子");
    }

    public void pay() {
        System.out.println("Proxy pay");
        buyer.pay();
    }
    public void dowork(){
        System.out.println("Proxy 办手续");
    }
}
