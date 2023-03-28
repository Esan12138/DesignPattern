package principle.lkp;

/**
 * @Description:
 * @Date:2023-03-14-14:31
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Star star = new Star("胡桃");
        Agent agent = new Agent();
        Fans fans = new Fans("钟离");
        Company company = new Company("往生堂");
        agent.setMySTar(star);
        agent.setMyFans(fans);
        agent.setMyCompany(company);
        agent.metting();
        agent.bussiness();
    }
}



class Star{
    private  String name;

    public Star(String name) {
        this.name = name;
    }

    public Star() {
    }
    public String getName() {
        return name;
    }
}
class Fans{
    private String name;

    public Fans(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Company{
    private String  name;

    public Company(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class   Agent{
    private Star mySTar;
    private Fans myFans;
    private Company myCompany;

    public void setMySTar(Star mySTar) {
        this.mySTar = mySTar;
    }

    public void setMyFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }
    public void metting() {
        System.out.println(myFans.getName()+"与明星"+mySTar.getName()+"见面了");
    }
    public void  bussiness(){
        System.out.println(myCompany.getName()+"与明星"+mySTar.getName()+"洽谈业务");
    }
}