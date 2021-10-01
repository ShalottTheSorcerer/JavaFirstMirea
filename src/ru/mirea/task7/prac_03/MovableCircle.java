package ru.mirea.task7.prac_03;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp() {
    }
    public void moveDown() {

    }
    public void moveLeft() {

    }
    public void moveRight() {

    }
}
