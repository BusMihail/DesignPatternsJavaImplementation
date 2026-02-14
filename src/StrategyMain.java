import behavioral_patterns.strategy.ConcreteStrategyOne;
import behavioral_patterns.strategy.ConcreteStrategyTwo;
import behavioral_patterns.strategy.Context;
import behavioral_patterns.strategy.Strategy;

void main() {
    Strategy strategyOne = new ConcreteStrategyOne();
    Strategy strategyTwo = new ConcreteStrategyTwo();
    Context context = new Context(strategyOne);
    context.executeStrategy("Hello, World!");
    context.setStrategy(strategyTwo);
    context.executeStrategy("Hello, World!");
}