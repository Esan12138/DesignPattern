package DesignPattern.factory.FactoryMethod;

/**
 * @Description:
 * @Date:2023-03-31-8:32
 * @author:Esan
 */
public class LineChart implements Chart{
    @Override
    public void display() {
        System.out.println("展示Line表");
    }
}
