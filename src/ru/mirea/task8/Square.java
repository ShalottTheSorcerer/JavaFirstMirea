package ru.mirea.task8;

public class Square extends Shape{
    protected int side;

    public Square() {
        super();
        this.side = (int)(Math.random() * 300);
    }
}
