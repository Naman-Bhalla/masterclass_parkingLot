package services.feesCalculator.strategies.ml;

import models.VehicleType;
import services.feesCalculator.strategies.FeesCalculatorStrategyFactory;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

public class MLStrategyFactory implements FeesCalculatorStrategyFactory {

    @Override
    public FeesCalculatorStrategyInterface getStrategyForVehicle(VehicleType type) {
        switch (type) {
            case LARGE:
                return new LargeVehicleMLStrategy();
            case MEDIUM:
            case SMALL:
                return new SmallMediumMLStrategy();
        }
        return null;
    }
}
