package services.feesCalculator.strategies;

import models.VehicleType;

public interface FeesCalculatorStrategyFactory {
    FeesCalculatorStrategyInterface getStrategyForVehicle(VehicleType type);
}
