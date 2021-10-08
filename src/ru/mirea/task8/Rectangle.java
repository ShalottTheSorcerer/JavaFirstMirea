package ru.mirea.task8;

public class Rectangle extends Shape{
    protected int width;
    protected int length;

    public Rectangle() {
        super();
        this.width = (int)(Math.random() * 300);
        this.length = (int)(Math.random() * 300);
    }
}
