package ru.mirea.task7.prac_03;

class Square extends Rectangle{

    public Square(double side) {
        super();
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.width = side;
        this.length = side;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = width;
    }
    public double getSide() {
        return width;
    }
    public void setLength(double side) {
        this.length = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }
    public String toString() {
        if (this.filled) {
            return ("This is the "+getColor()+" filled square which area is "+getArea()+" and perimeter is "+getPerimeter());
        } else {
            return ("This is the "+getColor()+" non filled square which area is "+getArea()+" and perimeter is "+getPerimeter());
        }
    }
}
