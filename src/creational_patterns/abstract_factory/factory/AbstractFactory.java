package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.domain.alpha.Alpha;
import creational_patterns.abstract_factory.domain.beta.Beta;

public interface AbstractFactory {
    Alpha createAlpha();
    Beta createBeta();
}
