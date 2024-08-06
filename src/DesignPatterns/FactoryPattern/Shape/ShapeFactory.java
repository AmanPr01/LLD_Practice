package DesignPatterns.FactoryPattern.Shape;

public class ShapeFactory {

    public Shape getShape(SupportedShape shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
