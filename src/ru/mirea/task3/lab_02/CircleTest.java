package ru.mirea.task3.lab_02;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
        Circle c2 = new Circle();
        c2.setRadius(2.5);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        c2.round();
        c1.area();
    }
}