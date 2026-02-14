package structural_patterns.decorator;

public final class DecoratorSpecific extends DecoratorBase{
    public DecoratorSpecific(DecorateMe decorateMe) {
        super(decorateMe);
    }

    @Override
    public void behavior1(String info) {
        this.decorateMe.behavior1(info.toLowerCase());

    }

    @Override
    public void behavior2(String info) {
        this.decorateMe.behavior2(info.toUpperCase());
    }
}
