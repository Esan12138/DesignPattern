/**
 * @Description:
 * @Date:2023-04-07-10:12
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        //获取皇帝
        Emperor emperor = Emperor.getInstance();
        System.out.println("皇帝起身");
        System.out.println("-------------------------------------------------------------");
        System.out.println(emperor);
        //为皇帝更衣
        DressFactory dressFactory1 = new DressFactory();
        dressFactory1.createcloth("便衣").dress(emperor);
        System.out.println(emperor);

        System.out.println("-------------------------------------------------------------");

        DressFactory dressFactory2 = new DressFactory();
        dressFactory2.createcloth("礼服").dress(emperor);
        System.out.println(emperor);
        Emperor instance = Emperor.getInstance();
    }
}

class Emperor {
    public static Emperor emperor;
    private String name;
    private cloth dress;

    static {
        emperor = new Emperor("秦始皇");
    }

    private Emperor(String name) {
        this.name = name;
    }

    public static Emperor getInstance() {
        if (emperor == null) {
            return emperor = new Emperor("秦始皇");
        }
        return emperor;
    }

    @Override
    public String toString() {
        return "Emperor{" +
                "name='" + name + '\'' +
                ", dress=" + dress +
                '}';
    }

    public void setDress(cloth dress) {
        this.dress = dress;
    }

    public String getName() {
        return name;
    }

    public cloth getDress() {
        return dress;
    }
}

abstract class cloth {
    public String clothName;
    public  String shoe;
    public abstract void dress(Emperor emperor);
}

class InformalCloth extends cloth{

    @Override
    public void dress(Emperor emperor) {
        clothName="便衣";
        shoe="便鞋";
        System.out.println("赵昌准备好便衣,并给皇帝:"+emperor.getName()+"更衣");
        emperor.setDress(this);
    }

    @Override
    public String toString() {
        return "InformalCloth{" +
                "clothName='" + clothName + '\'' +
                ", shoe='" + shoe + '\'' +
                '}';
    }
}

class FormalCloth extends cloth{

    @Override
    public void dress(Emperor emperor) {
        clothName="礼服";
        shoe="礼鞋";
        System.out.println("李德全准备好礼服穿搭,并给皇帝:"+emperor.getName()+"更衣");
        emperor.setDress(this);
    }

    @Override
    public String toString() {
        return "FormalCloth{" +
                "clothName='" + clothName + '\'' +
                ", shoe='" + shoe + '\'' +
                '}';
    }
}
class DressFactory{
    public cloth createcloth(String type){
        if("便衣".equalsIgnoreCase(type)){
            return new InformalCloth();
        }else if("礼服".equalsIgnoreCase(type)){
            return new FormalCloth();
        }
        return null;
    }
}