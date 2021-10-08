package ru.mirea.task11;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Zones extends JFrame {
    JPanel[] panel = new JPanel[9];
    public Zones() {
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(255, 255, 255));
            add(panel[i]);
        }
        Border b = BorderFactory.createLineBorder(Color.BLACK,2);
        panel[1].setBorder(b);
        JLabel label1 = new JLabel("NORTH");
        panel[1].add(label1);
        panel[1].addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to the North!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel[3].setBorder(b);
        JLabel label2 = new JLabel("WEST");
        panel[3].add(label2);
        panel[3].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to the West!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel[4].setBorder(b);
        JLabel label3 = new JLabel("CENTER");
        panel[4].add(label3);
        panel[4].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to the Center!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel[5].setBorder(b);
        JLabel label4 = new JLabel("EAST");
        panel[5].add(label4);
        panel[5].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to the East!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel[7].setBorder(b);
        JLabel label5 = new JLabel("SOUTH");
        panel[7].add(label5);
        panel[7].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to the South!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Zones().setVisible(true);
    }

}
