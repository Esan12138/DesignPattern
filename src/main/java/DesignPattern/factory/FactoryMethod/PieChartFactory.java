package DesignPattern.factory.FactoryMethod;

/**
 * @Description:
 * @Date:2023-03-31-8:34
 * @author:Esan
 */
public class PieChartFactory implements ChartFactory {
    @Override
    public Chart createChart() {
        return new PieChart();
    }
}
