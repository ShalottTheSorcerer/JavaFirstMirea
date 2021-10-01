package ru.mirea.task3.lab_02;

public class Circle {
    private double radius = 0;
    private double pi = 3.14;

    public Circle(double r) {
        radius = r;
    }
    public Circle() {
        radius = 1;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public void round() {
        System.out.println("Round: "+2*pi*radius);
    }
    public void area() {
        System.out.println("Round: "+radius*pi*radius);
    }
}