import creational_patterns.singleton.Singleton;

void main() {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println("Singleton 1: " + singleton1);
    System.out.println("Singleton 2: " + singleton2);
    System.out.println("Are both instances the same? " + (singleton1 == singleton2));
}