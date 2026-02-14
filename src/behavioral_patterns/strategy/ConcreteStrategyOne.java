package behavioral_patterns.strategy;

public class ConcreteStrategyOne implements Strategy {
    @Override
    public void execute(String data) {
        IO.println("ConcreteStrategyOne: " + data.toLowerCase());
    }
}
