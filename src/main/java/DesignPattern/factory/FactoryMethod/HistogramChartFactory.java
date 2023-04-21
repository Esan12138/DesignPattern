package DesignPattern.factory.FactoryMethod;

/**
 * @Description:
 * @Date:2023-03-31-8:33
 * @author:Esan
 */
public class HistogramChartFactory implements ChartFactory {
    @Override
    public Chart createChart() {
        return new HistogramChart();
    }
}
