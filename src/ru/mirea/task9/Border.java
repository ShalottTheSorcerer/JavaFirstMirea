package ru.mirea.task9;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Border extends JFrame {
    private int milan = 0;
    private int madrid = 0;
    private JLabel result;
    private JLabel lastWinner;
    private Label winner;
    JPanel[] panel = new JPanel[9];
    public Border() {
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(255, 255, 255));
            add(panel[i]);
        }
        panel[1].setLayout(new BorderLayout());
        result = new JLabel("Result: "+milan+" X "+madrid);
        panel[1].add(result, BorderLayout.CENTER);
        panel[3].setLayout(new BorderLayout());
        JButton buttonMilan = new JButton("Milan");
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                update();
                setWinner();
                updateResultMilan();
            }
        });
        panel[3].add(buttonMilan, BorderLayout.CENTER);
        panel[4].setLayout(new BorderLayout());
        winner = new Label("Winner: DRAW");
        panel[4].add(winner, BorderLayout.CENTER);
        panel[5].setLayout(new BorderLayout());
        JButton buttonMadrid = new JButton("Madrid");
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                update();
                setWinner();
                updateResultMadrid();
            }
        });
        panel[5].add(buttonMadrid, BorderLayout.CENTER);
        panel[7].setLayout(new BorderLayout());
        lastWinner = new JLabel("Last Scorer: N/A");
        panel[7].add(lastWinner, BorderLayout.CENTER);
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private void update() {
        result.setText("Result: "+milan+" X "+madrid);
    }
    private void updateResultMilan() {
        lastWinner.setText("Last Scorer: Milan");
    }
    private void updateResultMadrid() {
        lastWinner.setText("Last Scorer: Madrid");
    }
    private void setWinner() {
        if (milan > madrid) {
            winner.setText("Winner: MILAN");
        } else if (milan < madrid) {
            winner.setText("Winner: MADRID");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
    public static void main(String[] args) {
        new Border().setVisible(true);
    }

}
