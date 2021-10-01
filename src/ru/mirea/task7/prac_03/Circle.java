package ru.mirea.task7.prac_03;
import java.math.*;

class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public String toString() {
        if (this.filled) {
            return ("This is the "+getColor()+" filled circle which area is "+getArea()+" and perimeter is "+getPerimeter());
        } else {
            return ("This is the "+getColor()+" non filled circle which area is "+getArea()+" and perimeter is "+getPerimeter());
        }
    }
}

