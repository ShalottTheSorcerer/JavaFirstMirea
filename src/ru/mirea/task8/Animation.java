package ru.mirea.task8;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Animation extends JFrame {
    private static BufferedImage pic;
    public static void main(String[] args) {
        final Timer time = new Timer();
        time.schedule(new TimerTask() {
            int i = 0;
            public void run() {
                if (i == 0) {
                    JFrame frame = new JFrame();
                    try {
                        pic = ImageIO.read(new File("/home/shalott/Изображения/pic1.png")); // /home/shalott/Изображения/picture.jpg
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.setSize(new Dimension(pic.getWidth(), pic.getHeight()));
                    JLabel label = new JLabel(new ImageIcon("/home/shalott/Изображения/pic1.png"));
                    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    frame.setLocationRelativeTo(null);
                    frame.add(label);
                    frame.setVisible(true);
                } else if (i == 1) {
                    JFrame frame = new JFrame();
                    try {
                        pic = ImageIO.read(new File("/home/shalott/Изображения/pic2.png")); // /home/shalott/Изображения/picture.jpg
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.setSize(new Dimension(pic.getWidth(), pic.getHeight()));
                    JLabel label = new JLabel(new ImageIcon("/home/shalott/Изображения/pic2.png"));
                    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    frame.setLocationRelativeTo(null);
                    frame.add(label);
                    frame.setVisible(true);
                } else if (i == 2) {
                    JFrame frame = new JFrame();
                    try {
                        pic = ImageIO.read(new File("/home/shalott/Изображения/pic3.png")); // /home/shalott/Изображения/picture.jpg
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.setSize(new Dimension(pic.getWidth(), pic.getHeight()));
                    JLabel label = new JLabel(new ImageIcon("/home/shalott/Изображения/pic3.png"));
                    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    frame.setLocationRelativeTo(null);
                    frame.add(label);
                    frame.setVisible(true);
                } else {
                    JFrame frame = new JFrame();
                    try {
                        pic = ImageIO.read(new File("/home/shalott/Изображения/pic4.png")); // /home/shalott/Изображения/picture.jpg
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.setSize(new Dimension(pic.getWidth(), pic.getHeight()));
                    JLabel label = new JLabel(new ImageIcon("/home/shalott/Изображения/pic4.png"));
                    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    frame.setLocationRelativeTo(null);
                    frame.add(label);
                    frame.setVisible(true);
                }
                i++;
                if (i == 4) {
                    i = 0;
                }
            }
        }, 100, 250);
    }

}
