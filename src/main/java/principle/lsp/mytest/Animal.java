package principle.lsp.mytest;

/**
 * @Description:
 * @Date:2023-03-10-10:34
 * @author:Esan
 */
public class Animal {


    double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed=runSpeed;
    }
    public void getRunSpeed(double runSpeed) {
        System.out.println("行动的速度为：" + runSpeed);
    }

    public double getRuntime(double distance) {
        return (distance / runSpeed);
    }
}
