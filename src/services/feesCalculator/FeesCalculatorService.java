package services.feesCalculator;

import models.Ticket;
import services.feesCalculator.strategies.FeesCalculatorFactoryFactory;
import services.feesCalculator.strategies.FeesCalculatorStrategyInterface;
import services.feesCalculator.strategies.timeBased.TimeBasedStrategyFactory;

public class FeesCalculatorService {
    int calculateFees(Ticket ticket) {
        return FeesCalculatorFactoryFactory.getStrategyForType("ML")
                .getStrategyForVehicle(ticket.getVehicle().getType())
                .calculateFees(ticket);
    }
}

// Strategy to calculate fees
// - Time based strategy
// - Car size based strategy
// - ML based strategy

// THe correct class to calculate for a particular vehicle
// - time based strategy for big cars
// - time based strategy for medium cars
// - ml based strategy for big cars I might want to use google maps data
// - ml based strategy for bicycles, i might want to use time of day


// Assignment
// Implement an end to end flow for one vehicle
// 0. Instantiate a parking lot with n number of floors and m number of random slots in each floor.
// 1. A vehicle enters via an entry gate -> Ticket
// 2. Vehicle pays for the ticket ONline -> Payment
// 3. Vehicle goes for exit - Pay more money
// 4.  Vehicle pays money to operator and operator marks the payment in the system
// 5. 3. Vehicle goes for exit - Exit approved
// 1. Create a payment class
// 2. ExitGateController -> exit()
// 3. Payment Controller -> pay(type), payConfirm()
// DTO - Data Transfer Object
// RequestDTO
// ReponseDTO
