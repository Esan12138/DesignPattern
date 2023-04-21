package DesignPattern.factory.FactoryMethod;

/**
 * @Description:
 * @Date:2023-03-31-8:30
 * @author:Esan
 */
public class PieChart implements Chart {

    @Override
    public void display() {
        System.out.println("展示饼图");
    }
}
