package principle.dip;

import java.util.HashMap;
import java.util.Map;

public class DIPTest {
    public static void main(String[] args) {
         Customer wang=new Customer();
         wang.shopping(new BShop());
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : integerIntegerHashMap.entrySet()) {

        }

    }
}
interface Shop{
    String sell();
}
class AShop implements Shop{
    public String sell(){
        return "A地特产：火锅冒菜";
    }
}
class BShop implements Shop{
    public String sell(){
        return "B地特产:肉夹馍、凉皮";
    }
}
class Customer{
    //买哪个商店参数就换成哪个具体类
    public void shopping(Shop Shop){
        System.out.println(Shop.sell());
    }
}
