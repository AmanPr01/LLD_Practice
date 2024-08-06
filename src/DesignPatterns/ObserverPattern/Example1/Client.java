package DesignPatterns.ObserverPattern.Example1;

public class Client {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        Observer observer3 = new ConcreteObserver(subject);

        System.out.println("\nSetting state to 10");
        subject.setState(10);

        System.out.println("\nRemoving observer1");
        subject.removeObserver(observer1);

        System.out.println("\nSetting state to 20");
        subject.setState(20);
    }
}
