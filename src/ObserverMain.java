import behavioral_patterns.observer.ConcreteSubscriber;
import behavioral_patterns.observer.Publisher;
import behavioral_patterns.observer.Subscriber;

void main() {
    Publisher publisher = new Publisher();
    Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
    Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");
    Subscriber subscriber3 = new ConcreteSubscriber("Subscriber 3");

    publisher.subscribe(subscriber1);
    publisher.subscribe(subscriber2);
    publisher.subscribe(subscriber3);

    publisher.businessLogic();
}