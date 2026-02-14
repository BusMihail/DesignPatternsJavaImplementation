package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscribers;
    Object mainState = null;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : this.subscribers) {
            subscriber.update(this.mainState.toString());
        }
    }

    public void setMainState(Object mainState) {
            this.mainState = mainState;
            this.notifySubscribers();
        }

    public void businessLogic() {
        this.setMainState("New State");
    }
}
