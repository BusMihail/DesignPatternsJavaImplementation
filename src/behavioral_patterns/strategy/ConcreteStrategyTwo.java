package behavioral_patterns.strategy;

public class ConcreteStrategyTwo implements Strategy {
    @Override
    public void execute(String data) {

        IO.println("ConcreteStrategyTwo: " + data.toUpperCase());
    }
}
