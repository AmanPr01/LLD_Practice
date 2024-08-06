package DesignPatterns.BuilderPattern;

public class Car {

    private String engine;
    private int wheels;
    private String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    public static CarBuilder getBuilder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private String engine;
        private int wheels;
        private String color;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public String getEngine() {
            System.out.println("Engine: " + engine);
            return engine;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public int getWheels() {
            System.out.println("Wheels: " + wheels);
            return wheels;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public String getColor() {
            System.out.println("Color: " + color);
            return color;
        }

        public Car build() {

            // to build a car we can also put validation here

            // use this method to build the car object
            return new Car(this);
        }
    }
}


/*
One problem with writing getter method inside builder is that after we build the car with CarBuilder,
the instance is no longer accessible, so we need getter in the Car class.
We will se this in the next example.
 */