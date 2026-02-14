package behavioral_patterns.observer;

public class ConcreteSubscriber implements Subscriber {
    private String info;
    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
        this.info = name;
    }
    @Override
    public void update(String context) {
        this.info = this.name + " " + context;
        IO.println(this.info);
    }
}
