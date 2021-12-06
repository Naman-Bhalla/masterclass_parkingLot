package services.feesCalculator.strategies.ml;

import models.Ticket;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

public class LargeVehicleMLStrategy implements FeesCalculatorStrategyInterface {
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
