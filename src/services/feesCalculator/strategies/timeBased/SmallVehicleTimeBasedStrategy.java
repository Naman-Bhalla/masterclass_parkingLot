package services.feesCalculator.strategies.timeBased;

import models.Ticket;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

public class SmallVehicleTimeBasedStrategy implements FeesCalculatorStrategyInterface {
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
