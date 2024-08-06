package DesignPatterns.FactoryPattern.Animal;

public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
