package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String args[]) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        RedShapeDecorator redShapeRectangle = new RedShapeDecorator(rectangle);
        RedShapeDecorator redShapeCircle = new RedShapeDecorator(circle);
        redShapeRectangle.draw();
        redShapeRectangle.setRedBorder();
        redShapeCircle.draw();
        redShapeCircle.setRedBorder();
    }
}
