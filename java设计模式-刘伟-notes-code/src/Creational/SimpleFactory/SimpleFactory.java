package Creational.SimpleFactory;

public class SimpleFactory {
    public static Chart getChart(String chartName) {
        Chart chart = null;

        if ("linechart".equalsIgnoreCase(chartName)) {
            chart = new LineChart();
        } else if ("piechar".equalsIgnoreCase(chartName)) {
            chart = new PieChart();
        }
        return chart;
    }
}
