package ru.mirea.task2.prac_01;

public class Ball {
    private String type;
    private String color;

    public Ball(String t, String c) {
        type = t;
        color = c;
    }
    public Ball() {
        type = "rubber";
        color = "red";
    }
    public Ball(String c) {
        type = "rubber";
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
        return "This "+this.type+" ball is "+this.color;
    }
}
