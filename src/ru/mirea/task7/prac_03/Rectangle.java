package ru.mirea.task7.prac_03;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 2;
    }
    public Rectangle (double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle (String color, boolean filled) {
        super(color, filled);
        this.width = 1;
        this.length = 1;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }
    public String toString() {
        if (this.filled) {
            return ("This is the "+getColor()+" filled rectangle which area is "+getArea()+" and perimeter is "+getPerimeter());
        } else {
            return ("This is the "+getColor()+" non filled rectangle which area is "+getArea()+" and perimeter is "+getPerimeter());
        }
    }
}
