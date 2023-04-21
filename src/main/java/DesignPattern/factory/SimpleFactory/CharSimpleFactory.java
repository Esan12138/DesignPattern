package DesignPattern.factory.SimpleFactory;

/**
 * @Description:简单工厂类
 * @Date:2023-03-28-14:37
 * @author:Esan
 */
public class CharSimpleFactory {

    public  Chart getInstance(String type) {
        if ("LINECHART".equalsIgnoreCase(type)) {
            return new LineChart();
        } else if ("PIECHART".equalsIgnoreCase(type)) {
            return new PieChart();
        } else if ("HISTOGRAMCHART".equalsIgnoreCase(type)) {
            return new HistogramChart();
        } else {
            return null;
        }
    }

}
