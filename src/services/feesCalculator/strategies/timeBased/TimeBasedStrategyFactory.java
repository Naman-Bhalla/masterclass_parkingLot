package services.feesCalculator.strategies.timeBased;

import models.VehicleType;
import services.feesCalculator.strategies.FeesCalculatorStrategyFactory;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

public class TimeBasedStrategyFactory implements FeesCalculatorStrategyFactory {

    public FeesCalculatorStrategyInterface getStrategyForVehicle(VehicleType type) {
        switch (type) {
            case LARGE:
                return new LargeVehicleTimeBasedStrategy();
            case SMALL:
                return new SmallVehicleTimeBasedStrategy();
            case MEDIUM:
                return new MediumVehicleTimeBasedStrategy();
        }
        return null;
    }
}
