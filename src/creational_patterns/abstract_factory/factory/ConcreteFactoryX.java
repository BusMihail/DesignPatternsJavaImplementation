package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.domain.alpha.Alpha;
import creational_patterns.abstract_factory.domain.alpha.AlphaX;
import creational_patterns.abstract_factory.domain.beta.Beta;
import creational_patterns.abstract_factory.domain.beta.BetaX;

public class ConcreteFactoryX implements AbstractFactory {

    @Override
    public Alpha createAlpha() {
        return new AlphaX();
    }

    @Override
    public Beta createBeta() {
        return new BetaX();
    }
}
