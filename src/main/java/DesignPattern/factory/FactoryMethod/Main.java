package DesignPattern.factory.FactoryMethod;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Date:2023-03-31-8:34
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        //创建柱状图
//        HistogramChartFactory histogramChartFactory = new HistogramChartFactory();
//        Chart chart1 = histogramChartFactory.createChart();
//        chart1.display();
//
//        //创建折线图
//        LineChartFactory lineChartFactory = new LineChartFactory();
//        Chart chart2 = lineChartFactory.createChart();
//        chart2.display();
//
//        //创建饼图
//        PieChartFactory pieChartFactory = new PieChartFactory();
//        Chart chart3 = pieChartFactory.createChart();
//        chart3.display();

        while (true) {
            ChartFactory bean = (ChartFactory)XMLUtil.getBean("src/main/java/DesignPattern/factory/FactoryMethod/config.xml");
            Chart chart = bean.createChart();
            chart.display();
            Thread.sleep(1000);
        }
    }
}
