package services.feesCalculator.strategies;

import services.feesCalculator.strategies.ml.MLStrategyFactory;
import services.feesCalculator.strategies.timeBased.TimeBasedStrategyFactory;

public class FeesCalculatorFactoryFactory {
    public static FeesCalculatorStrategyFactory getStrategyForType(String type) {
        if (type.equals("ML")) {
            return new MLStrategyFactory();
        } else if (type.equals("TIME")) {
            return new TimeBasedStrategyFactory();
        }
        return null;
    }
}
