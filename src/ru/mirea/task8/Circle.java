package ru.mirea.task8;

public class Circle extends Shape{
    protected int radius;

    public Circle() {
        super();
        this.radius = (int)(Math.random() * 300);
    }
}
