package services.feesCalculator.strategies;

import models.Ticket;

public interface FeesCalculatorStrategyInterface {
    int calculateFees(Ticket ticket);
}
