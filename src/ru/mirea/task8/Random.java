package ru.mirea.task8;
import javax.swing.*;
import  java.awt.*;

public class Random extends JFrame{
    public Random(){
        setSize(800, 800);
        setBackground(new Color(255, 255, 255));
        Print smt = new Print();
        add(smt);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Random().setVisible(true);
    }
}