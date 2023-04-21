package principle.homework;

/**
 * @Description:
 * @Date:2023-04-02-22:22
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Pen LargeBlackPen = new Pen(new LargePen(), new BlackPen());
        LargeBlackPen.getInfo();

        Pen MiddleRedPen = new Pen(new MiddlePen(), new RedPen());
        MiddleRedPen.getInfo();
    }
}

class Pen {
    private Size size;
    private Color color;

    public Pen(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void getInfo() {
        System.out.println("画笔的颜色是:" + color.color() + ",大小型号是:" + size.size());
    }
}

abstract class Size {
    public abstract String size();
}

class LargePen extends Size {
    @Override
    public String size() {
        return "大型画笔";
    }
}

class MiddlePen extends Size {
    @Override
    public String size() {
        return "中型画笔";
    }
}

class SmallPen extends Size {
    @Override
    public String size() {
        return "小型画笔";
    }
}

abstract class Color {
    public abstract String color();
}

class BlackPen extends Color {
    @Override
    public String color() {
        return "黑色";
    }
}

class RedPen extends Color {
    @Override
    public String color() {
        return "红色";
    }
}