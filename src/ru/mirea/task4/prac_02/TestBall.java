package ru.mirea.task4.prac_02;

public class TestBall {
    public static void main(String[] args) {
        Ball first = new Ball();
        first.setXY(5.2, 2);
        first.move(2.0, 2.0);
        System.out.println(first);
    }
}
