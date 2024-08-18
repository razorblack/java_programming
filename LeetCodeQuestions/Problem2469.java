import java.util.Arrays;

public class Problem2469 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }

    // Time O1 Space O1
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.8 + 32.00};
    }
}
