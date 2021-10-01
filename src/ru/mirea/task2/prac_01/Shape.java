package ru.mirea.task2.prac_01;

public class Shape {
    private String type;
    private String color;

    public Shape (String t, String c) {
        type = t;
        color = c;
    }
    public Shape () {
        type = "circle";
        color = "black";
    }
    public Shape (String c) {
        type = "circle";
        color = c;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "This "+this.type+" is "+this.color;
    }
}
