package behavioral_patterns.state;

public class Context {
    State state;

    public Context() {
        state = new ConcreteStateOne(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }
}
