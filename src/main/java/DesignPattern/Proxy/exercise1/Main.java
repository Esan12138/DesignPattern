package DesignPattern.Proxy.exercise1;

/**
 * @Description:
 * @Date:2023-05-05-11:20
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();
        proxy.query();
    }
}


interface method {
    public void query();
}

class Company implements method {
    public void query() {
        System.out.println("商务信息查询");
    }
}

class Proxy implements method {
    private Company company;

    public Proxy() {
        this.company = new Company();
    }

    public void verify() {
        System.out.println("身份验证");
    }

    public void CountLog() {
        System.out.println("统计次数");
    }

    @Override
    public void query() {
        verify();
        CountLog();
        company.query();
    }
}