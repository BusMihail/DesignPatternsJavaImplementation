package structural_patterns.decorator;

public class DecoratorBase implements DecorateMe {
    protected final DecorateMe decorateMe;

    public DecoratorBase(DecorateMe decorateMe) {
        this.decorateMe = decorateMe;
    }

    @Override
    public void behavior1(String info) {
        decorateMe.behavior1(info);
    }

    @Override
    public void behavior2(String info) {
        decorateMe.behavior2(info);
    }
}
