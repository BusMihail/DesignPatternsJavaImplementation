package behavioral_patterns.state;

public class ConcreteStateOne implements State {
    private final Context context;

    public ConcreteStateOne(Context context) {
        this.context = context;
    }

    public void doThis() {
        IO.println("ConcreteStateOne: Doing this.");
    }

    public void doThat() {
        IO.println("ConcreteStateOne: Doing that.");
        context.setState(new ConcreteStateTwo(context));
    }
}
