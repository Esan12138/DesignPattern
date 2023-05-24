package DesignPattern.Bridge.dmo1;

/**
 * @Description:桥接模式
 * @Date:2023-04-28-8:34
 * @author:Esan
 */
public class Main{
    public static void main(String[] args) {
        PaintBrush paintBrush = new PaintBrush(new RedColor());
        paintBrush.draw();
    }
}
interface Pen {
    public void draw();
}

interface Color{
    public void dye();
    String getColor() ;
}
class RedColor implements Color {
    @Override
    public void dye() {
        System.out.println("红色");
    }
   public String getColor() {
        return "红色";
    }
}

class PaintBrush implements Pen {
    protected Color color;

    public PaintBrush(Color cloud) {
        this.color = cloud;
    }

    @Override
    public void draw() {
        System.out.println(color.getColor()+"的画笔开始绘画");
    }
}
