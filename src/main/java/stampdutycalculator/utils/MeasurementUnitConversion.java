package stampdutycalculator.utils;

public class MeasurementUnitConversion {
    public static double convertSquareMetersToSquareFeet(double squareMeters) {
        return squareMeters * 10.76;
    }

    public static double convertSquareFeetToSquareMeters(double squareFeet) {
        return squareFeet / 10.76;
    }
}
