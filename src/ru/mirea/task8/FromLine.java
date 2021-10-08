package ru.mirea.task8;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;

public class FromLine extends JFrame {
    private static BufferedImage pic;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        try {
            pic = ImageIO.read(new File(path)); // /home/shalott/Изображения/picture.jpg
        } catch (IOException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(pic.getWidth(), pic.getHeight()));
        JLabel label = new JLabel(new ImageIcon(path));
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.setVisible(true);
    }
}
