package services.feesCalculator.strategies.timeBased;

import models.Ticket;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;

import java.sql.Time;

public class LargeVehicleTimeBasedStrategy implements FeesCalculatorStrategyInterface {
    @Override
    public int calculateFees(Ticket ticket) {
        return 0;
    }
}
