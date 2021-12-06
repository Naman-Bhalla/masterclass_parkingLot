package services.feesCalculator.strategies.timeBased;

import models.Ticket;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

public class MediumVehicleTimeBasedStrategy implements FeesCalculatorStrategyInterface {
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
