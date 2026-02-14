package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.domain.alpha.Alpha;
import creational_patterns.abstract_factory.domain.alpha.AlphaY;
import creational_patterns.abstract_factory.domain.beta.Beta;
import creational_patterns.abstract_factory.domain.beta.BetaY;

public class ConcreteFactoryY implements AbstractFactory {

    @Override
    public Alpha createAlpha() {
        return new AlphaY();
    }

    @Override
    public Beta createBeta() {
        return new BetaY();
    }
}
