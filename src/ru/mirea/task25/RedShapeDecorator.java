package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator{
    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
    }
    public void setRedBorder() {
        System.out.println("The border of this shape is red");
    }
}
