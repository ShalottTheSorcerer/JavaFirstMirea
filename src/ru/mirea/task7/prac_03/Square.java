package ru.mirea.task7.prac_03;

class Square extends Rectangle{
    protected double side;

    public Square(double side) {
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }
    public double getArea() {
        return this.side * this.side;
    }
    public double getPerimeter() {
        return 4 * this.side;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public String toString() {
        if (this.filled) {
            return ("This is the "+getColor()+" filled square which area is "+getArea()+" and perimeter is "+getPerimeter());
        } else {
            return ("This is the "+getColor()+" non filled square which area is "+getArea()+" and perimeter is "+getPerimeter());
        }
    }
}
