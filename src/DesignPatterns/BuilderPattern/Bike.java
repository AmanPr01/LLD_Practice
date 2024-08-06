package DesignPatterns.BuilderPattern;

public class Bike {

    private String engine;
    private int wheels;
    private String color;

    public Bike(String engine, int wheels, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.color = color;
    }

    public Bike() {}

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }
}
