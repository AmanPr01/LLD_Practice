package DesignPatterns.ProtypePattern;

public class Circle implements Prototype {

    private final int radius;
    private final String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public String toString() {
        return "Circle [radius = " + radius + ", color = " + color + "]";
    }
}
