import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class chartPlotter extends Application {

    // Static fields to hold the data from Main
    private static long[] insertionAvg;
    private static long[] mergeAvg;
    private static long[] insertionSortedAvg;

    // Called from Main BEFORE launch
    public static void setData(long[] insertion, long[] merge, long[] insertionSorted) {
        insertionAvg = insertion;
        mergeAvg = merge;
        insertionSortedAvg = insertionSorted;
    }

    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.getCategories().addAll("500", "1000", "2000", "4000", "8000");
        xAxis.setLabel("Input Size (N)");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Time (ms)");
        yAxis.setForceZeroInRange(false);

        LineChart<String, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Sort Performance");
        chart.setCreateSymbols(true);
        chart.setLegendVisible(true);
        chart.setAnimated(false);

        // Series A - Insertion Sort (from passed data, converted to ms)
        XYChart.Series<String, Number> seriesA = new XYChart.Series<>();
        seriesA.setName("Insertion Sort");
        String[] categories = {"500", "1000", "2000", "4000", "8000"};
        for (int i = 0; i < 5; i++) {
            long ms = insertionAvg[i] / 1_000_000;  // convert ns to ms
            seriesA.getData().add(new XYChart.Data<>(categories[i], ms));
        }

        // Series B - Merge Sort (from passed data)
        XYChart.Series<String, Number> seriesB = new XYChart.Series<>();
        seriesB.setName("Merge Sort");
        for (int i = 0; i < 5; i++) {
            long ms = mergeAvg[i] / 1_000_000;
            seriesB.getData().add(new XYChart.Data<>(categories[i], ms));
        }

        // Series C - Insertion Sort (already sorted)
        XYChart.Series<String, Number> seriesC = new XYChart.Series<>();
        seriesC.setName("Insertion Sort (sorted)");
        for (int i = 0; i < 5; i++) {
            long ms = insertionSortedAvg[i] / 1_000_000;
            seriesC.getData().add(new XYChart.Data<>(categories[i], ms));
        }

        chart.getData().addAll(seriesA, seriesB, seriesC);

        StackPane root = new StackPane(chart);
        Scene scene = new Scene(root, 850, 550);
        stage.setScene(scene);
        stage.show();
    }
}


