package stampdutycalculator.service;

import java.util.Map;

public interface StampDutyCalculationI {

    /**
     * Method to calculate stamp duty.
     * @param dutyCalculationDto - object with data for calculation
     * @return - map of stamp duty values for different categories
     */
    Map<StampDutyValueCategory, Double> calculateStampDuty(DutyCalculationDto dutyCalculationDto);
}
