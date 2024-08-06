package DesignPatterns.FactoryPattern.Animal;

public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
