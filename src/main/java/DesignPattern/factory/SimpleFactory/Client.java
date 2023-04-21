package DesignPattern.factory.SimpleFactory;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
//        LineChart lineChart = new LineChart();
//        lineChart.display();
        CharSimpleFactory charSimpleFactory = new CharSimpleFactory();
        Chart linechart = charSimpleFactory.getInstance("linechart");
        Chart histogramchart = charSimpleFactory.getInstance("HistogramChart");
        Chart piechart = charSimpleFactory.getInstance("piechart");
        System.out.println("--------------------------------------------------------------");
        linechart.display();
        histogramchart.display();
        piechart.display();
    }
}
