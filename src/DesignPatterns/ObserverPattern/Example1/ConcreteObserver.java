package DesignPatterns.ObserverPattern.Example1;

public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer Notified. State is now: " + subject.getState());
    }
}
