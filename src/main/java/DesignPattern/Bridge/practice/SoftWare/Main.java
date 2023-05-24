package DesignPattern.Bridge.practice.SoftWare;

/**
 * @Description:
 * @Date:2023-04-28-10:34
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        OS os = new Linux(new MySoftware());
        os.display(new Jpg());

        os = new Windows(new MySoftware());
        os.display(new Gif());
    }
}

interface Software {
    String resolve(Type type);
    void display();
}
interface OS{
    void display(Type tpye);
}
interface Type{
    String getType();
}
abstract class AbstractSoftware implements Software {

}
class MySoftware extends AbstractSoftware {
    @Override
    public String resolve(Type type) {
        return type.getType();
    }

    @Override
    public void display() {

    }
}
abstract class AbstactOs implements OS{
    protected Software software;

    public AbstactOs(Software software) {
        this.software = software;
    }
}
class Jpg implements Type{

    @Override
    public String getType() {
        return "jpg";
    }
}
class Gif implements Type{

    @Override
    public String getType() {
        return "gif";
    }
}

class Linux extends AbstactOs{


    public Linux(Software software) {
        super(software);
    }

    @Override
    public void display(Type type) {
        String resolve = software.resolve(type);
        System.out.println("linux展示："+resolve);
    }
}
class Windows extends AbstactOs{

    public Windows(Software software) {
        super(software);
    }

    @Override
    public void display(Type type) {
        String resolve = software.resolve(type);
        System.out.println("Windows"+resolve);
    }
}