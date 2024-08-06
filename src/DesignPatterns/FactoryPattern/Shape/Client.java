package DesignPatterns.FactoryPattern.Shape;

public class Client {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(SupportedShape.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(SupportedShape.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(SupportedShape.SQUARE);
        shape3.draw();
    }
}
