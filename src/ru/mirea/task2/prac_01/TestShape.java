package ru.mirea.task2.prac_01;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("triangle", "yellow");
        Shape s2 = new Shape();
        Shape s3 = new Shape("red");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
