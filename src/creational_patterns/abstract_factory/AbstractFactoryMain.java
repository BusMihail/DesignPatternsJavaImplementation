import creational_patterns.abstract_factory.domain.alpha.Alpha;
import creational_patterns.abstract_factory.domain.beta.Beta;
import creational_patterns.abstract_factory.factory.AbstractFactory;
import creational_patterns.abstract_factory.factory.ConcreteFactoryX;
import creational_patterns.abstract_factory.factory.ConcreteFactoryY;

    void main(String[] args) {
        AbstractFactory factoryX = new ConcreteFactoryX();
        AbstractFactory factoryY = new ConcreteFactoryY();

        Alpha alphaX = factoryX.createAlpha();
        Beta betaX = factoryX.createBeta();

        Alpha alphaY = factoryY.createAlpha();
        Beta betaY = factoryY.createBeta();

        alphaX.printAlphaType();
        betaX.printBetaType();

        alphaY.printAlphaType();
        betaY.printBetaType();
    }

