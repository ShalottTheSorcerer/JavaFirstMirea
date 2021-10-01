package ru.mirea.task7.prac_03;

public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return ("x: "+x+" y: "+y+"\nSpeed of x: "+xSpeed+" Speed of y: "+ySpeed);
    }
    public void moveUp() {
        y += ySpeed;
    }
    public void moveDown() {
        y -= ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }
}
