package DesignPattern.factory.FactoryMethod;

/**
 * @Description:
 * @Date:2023-03-31-8:32
 * @author:Esan
 */
public class LineChartFactory implements ChartFactory {
    @Override
    public Chart createChart() {
        return new LineChart();
    }
}
