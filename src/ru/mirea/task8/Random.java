package ru.mirea.task8;
import ru.mirea.task3.lab_02.Circle;

import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;

public class Random extends Shape{

    public Random(){
        JFrame frame = new JFrame();
        //frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        //frame.pack();
        //Circle circle1 = new Circle(x, y, Math.random()*200);
        //frame.add(circle1);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Random app = new Random();
    }
}