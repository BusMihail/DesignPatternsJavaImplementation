package behavioral_patterns.state;

public class ConcreteStateTwo implements State {

    private final Context context;

    public ConcreteStateTwo(Context context) {
        this.context = context;
    }

    public void doThis() {
        IO.println("ConcreteStateOne: Doing this.");
    }

    public void doThat() {
        IO.println("ConcreteStateOne: Doing that.");
        context.setState(new ConcreteStateOne(context));
    }
}
