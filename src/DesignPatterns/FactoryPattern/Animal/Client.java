package DesignPatterns.FactoryPattern.Animal;

public class Client {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal cat = animalFactory.getAnimal(AnimalType.CAT);
        cat.speak();

        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        dog.speak();

    }
}
