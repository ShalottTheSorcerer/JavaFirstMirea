package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame{
    private int total = 0;
    private int choice = -1;
    private int prize = (int)(Math.random() * 20);
    private JTextField input;
    JPanel[] panel = new JPanel[2];
    public Game() {
        setLayout(new GridLayout(2,1));
        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(255, 255, 255));
            add(panel[i]);
        }
        panel[0].setLayout(new BorderLayout());
        input = new JTextField();
        panel[0].add(input, BorderLayout.CENTER);
        panel[1].setLayout(new BorderLayout());
        JButton button = new JButton("Try!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total++;
                setWinner();
            }
        });
        panel[1].add(button, BorderLayout.CENTER);
        setSize(300, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private void setWinner() {
        try {
            choice = Integer.parseInt(input.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Write down your number");
            total--;
        }
        if (choice > -1) {
            if (prize == choice) {
                JOptionPane.showMessageDialog(null, "You have won!");
                System.exit(0);
            } else if (total == 3) {
                JOptionPane.showMessageDialog(null, "You have lost, the desired number is: "+prize);
                System.exit(0);
            } else if (choice > prize) {
                JOptionPane.showMessageDialog(null, "The desired number is smaller");
            } else if (choice < prize) {
                JOptionPane.showMessageDialog(null, "The desired number is bigger");
            }
        }
    }
    public static void main(String[] args) {
        new Game().setVisible(true);
    }

}
