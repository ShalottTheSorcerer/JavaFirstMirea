package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontAndText extends JFrame {
    private JTextArea input;
    JFrame frame = new JFrame();
    public FontAndText() {
        input = new JTextArea(40,10);
        input.setLineWrap(true);
        input.setWrapStyleWord(true);
        Font font = new Font("Times new roman", Font.BOLD, 20);
        input.setFont(font);
        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Color");
        JMenuItem blue = new JMenuItem("Blue");
        colorMenu.add(blue);
        JMenuItem red = new JMenuItem("Red");
        colorMenu.add(red);
        JMenuItem black = new JMenuItem("Black");
        colorMenu.add(black);
        JMenu fontMenu = new JMenu("Font");
        JMenuItem tnr = new JMenuItem("Times new roman");
        fontMenu.add(tnr);
        JMenuItem mss = new JMenuItem("MS Sans Serif");
        fontMenu.add(mss);
        JMenuItem cn = new JMenuItem("Courier New");
        fontMenu.add(cn);

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(Color.BLUE);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(Color.RED);
            }
        });
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(Color.BLACK);
            }
        });
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times new roman", Font.BOLD, 20);
                input.setFont(font);
            }
        });
        mss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("MS Sans Serif", Font.BOLD, 20);
                input.setFont(font);
            }
        });
        cn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Courier New", Font.BOLD, 20);
                input.setFont(font);
            }
        });
        add(input);
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new FontAndText().setVisible(true);
    }

}