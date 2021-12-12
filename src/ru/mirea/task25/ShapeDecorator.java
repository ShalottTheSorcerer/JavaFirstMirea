package ru.mirea.task25;

abstract class ShapeDecorator {
    Shape shape;
    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public abstract void draw();
}
