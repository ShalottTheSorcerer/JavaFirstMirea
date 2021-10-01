package ru.mirea.task3.lab_02;

public class Human {
    private String arm;
    private String leg;
    private String head;

    public Human() {
        arm = "natural";
        leg = "natural";
        head = "robotic";
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getArm() {
        return arm;
    }

    public String getHead() {
        return head;
    }

    public String getLeg() {
        return leg;
    }

    public String toString() {return "The body contains: it's arm is "+this.arm+", it's leg is "+this.leg+", it's head is "+this.head;}
}
