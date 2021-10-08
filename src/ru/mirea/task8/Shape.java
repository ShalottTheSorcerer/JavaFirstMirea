package ru.mirea.task8;

import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;

    public Shape() {
        this.x = (int)(Math.random() * 800);
        this.y = (int)(Math.random() * 800);
        this.color = new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
    }
}

