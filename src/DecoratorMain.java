import structural_patterns.decorator.DecorateMe;
import structural_patterns.decorator.DecorateMeImpl;
import structural_patterns.decorator.DecoratorBase;
import structural_patterns.decorator.DecoratorSpecific;

void main() {
    DecorateMe decorateMe = new DecorateMeImpl();
    DecoratorBase decorator = new DecoratorBase(decorateMe);
    decorator.behavior1("Hello");
    decorator.behavior2("World");
    DecoratorSpecific decoratorSpecific = new DecoratorSpecific(decorateMe);
    decoratorSpecific.behavior1("Hello");
    decoratorSpecific.behavior2("World");
}