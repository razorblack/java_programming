package stampdutycalculator.service;

import java.util.HashMap;
import java.util.Map;

import stampdutycalculator.utils.MeasurementUnitConversion;

public class StampDutyCalculation implements StampDutyCalculationI{

    public Map<StampDutyValueCategory, Double> calculateStampDuty(DutyCalculationDto dutyCalculationDto) {
        Map<StampDutyValueCategory, Double> stampDutyValues = new HashMap<>();
        if (dutyCalculationDto.stampDutySegment.equals(StampDutySegment.HOUSE)) {
            calculateStampDutyForHouse(dutyCalculationDto, stampDutyValues);
        } else if (dutyCalculationDto.stampDutySegment.equals(StampDutySegment.PLOT)) {
            calculateStampDutyForPlot(dutyCalculationDto, stampDutyValues);
        } else {
            return null;
        }
        
        return stampDutyValues;
    }

    private void calculateStampDutyForPlot(DutyCalculationDto dutyCalculationDto, Map<StampDutyValueCategory, Double> stampDutyValues) {
        double areaForCalculationInSqMeter = MeasurementUnitConversion.convertSquareFeetToSquareMeters(dutyCalculationDto.areaForCalculation);
        double plotValue = getValue(dutyCalculationDto, areaForCalculationInSqMeter);
        double courtFee = calculateCourtFee(dutyCalculationDto, plotValue);

        calculateCategoryWiseDuty(stampDutyValues, plotValue, courtFee);
    }

    private static double calculateCourtFee(DutyCalculationDto dutyCalculationDto, double plotValue) {
        return plotValue * dutyCalculationDto.courtFeePercentage / 100;
    }

    private static void calculateCategoryWiseDuty(Map<StampDutyValueCategory, Double> stampDutyValues, double totalPlotValue, double courtFee) {
        double stampDutyForMale;
        double stampDutyForFemale;
        if (totalPlotValue < 10_00_000) {
            stampDutyForFemale = totalPlotValue * 0.06;
            stampDutyForMale = totalPlotValue * 0.07;
        } else {
            stampDutyForMale = totalPlotValue * 0.07;
            stampDutyForFemale = stampDutyForMale - 10_000;
        }
        stampDutyValues.put(StampDutyValueCategory.MALE, stampDutyForMale);
        stampDutyValues.put(StampDutyValueCategory.FEMALE, stampDutyForFemale);
        stampDutyValues.put(StampDutyValueCategory.COURT, courtFee);
    }

    private static double getValue(DutyCalculationDto dutyCalculationDto, double areaForCalculationInSqMeter) {
        return areaForCalculationInSqMeter * dutyCalculationDto.circleRate;
    }

    private void calculateStampDutyForHouse(DutyCalculationDto dutyCalculationDto, Map<StampDutyValueCategory, Double> stampDutyValues) {
        double coveredAreaInSqMeter = MeasurementUnitConversion.convertSquareFeetToSquareMeters(dutyCalculationDto.coveredArea);
        double coveredPlotValue = getValue(dutyCalculationDto, coveredAreaInSqMeter);
        double plotValue = getValue(dutyCalculationDto, dutyCalculationDto.areaForCalculation);
        double totalValue = coveredPlotValue + plotValue;
        double courtFee = calculateCourtFee(dutyCalculationDto, totalValue);
        calculateCategoryWiseDuty(stampDutyValues, totalValue, courtFee);
    }

    public static void main(String[] args) {
        StampDutyCalculation obj = new StampDutyCalculation();
        DutyCalculationDto dto = new DutyCalculationDto();
        dto.stampDutySegment = StampDutySegment.HOUSE;
        dto.circleRate = 15000;
        dto.areaForCalculation = 1000;
        dto.courtFeePercentage = 1;
        dto.coveredArea = 1500;

        System.out.println(obj.calculateStampDuty(dto));
    }
}
