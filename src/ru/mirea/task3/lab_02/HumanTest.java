package ru.mirea.task3.lab_02;

public class HumanTest {
    public static void main(String[] args) {
        Human c1 = new Human();
        c1.setArm("robotic");
        c1.setLeg("robotic");
        c1.setHead("natural");
        System.out.println(c1.getArm());
        System.out.println(c1.getLeg());
        System.out.println(c1.getHead());
        System.out.println(c1);
    }
}
