package DesignPatterns.FactoryPattern.Animal;

public class AnimalFactory {
    public Animal getAnimal(AnimalType animalType) {
        return switch (animalType) {
            case DOG -> new Dog();
            case CAT -> new Cat();
        };
    }
}
