package structural_patterns.decorator;

public final class DecorateMeImpl implements DecorateMe {

    public DecorateMeImpl() {}
    @Override
    public void behavior1(String info) {
        IO.println("behavior 1: " + info);
    }

    @Override
    public void behavior2(String info) {
        IO.println("behavior 2: " + info);
    }

}
