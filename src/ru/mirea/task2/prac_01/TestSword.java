package ru.mirea.task2.prac_01;

public class TestSword {
    public static void main(String[] args) {
        Sword s1 = new Sword("short","saber","falchion");
        Sword s2 = new Sword();
        Sword s3 = new Sword("zweihander");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}