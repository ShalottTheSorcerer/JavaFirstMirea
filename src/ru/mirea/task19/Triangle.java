package ru.mirea.task19;

import java.util.Scanner;

class Triangle {

    private double a = 5, b = 4, c = 3;
    private double hAngle, c1Angle, c2Angle;

    public Triangle() {}

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void sethAngle(double hAngle) {
        this.hAngle = hAngle;
    }
    public void setC1Angle(double c1Angle) {
        this.c1Angle = c1Angle;
    }
    public void setC2Angle(double c2Angle) {
        this.c2Angle = c2Angle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("The initial parameters are: ");
        System.out.println("The hypotenuse is: " + triangle.getA());
        System.out.println("The first leg is: " + triangle.getB());
        System.out.println("The second leg is: " + triangle.getC());
        System.out.println("Enter the center angle:");
        triangle.sethAngle(sc.nextDouble());
        System.out.println("Enter the angle near the first leg:");
        triangle.setC1Angle(sc.nextDouble());
        System.out.println("Enter the angle near the second leg:");
        triangle.setC2Angle(sc.nextDouble());
        try {
            if ((triangle.hAngle != 90) || (triangle.c1Angle >= 90) || (triangle.c2Angle >= 90) || ((triangle.c2Angle + triangle.c1Angle + triangle.hAngle) != 180)) {
                throw new TriangleException();
            }
        }
        catch(TriangleException e)
        {
            System.out.println("Exception: "+e.toString());
            return;
        }
        triangle.setB(((triangle.a)*Math.sin(Math.toRadians(triangle.c1Angle)))/(Math.sin(Math.toRadians(triangle.hAngle))));
        triangle.setC(((triangle.a)*Math.sin(Math.toRadians(triangle.c2Angle)))/(Math.sin(Math.toRadians(triangle.hAngle))));
        System.out.println("Now parameters are: ");
        System.out.println("The hypotenuse is: " + triangle.getA());
        System.out.println("The first leg is: " + triangle.getB());
        System.out.println("The second leg is: " + triangle.getC());
    }
}