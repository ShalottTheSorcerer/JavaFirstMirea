package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Print extends JPanel {
    public void paint(Graphics f) {
        for (int i = 0; i < 20; i++) {
            int chance = (int)(Math.random() * 3);
            if (chance == 1) {
                Circle circle = new Circle();
                f.setColor(circle.color);
                f.fillOval(circle.x, circle.y, circle.radius, circle.radius);
            } else if (chance == 2) {
                Rectangle rec = new Rectangle();
                f.setColor(rec.color);
                f.fillRect(rec.x, rec.y, rec.width, rec.length);
            } else {
                Square sq = new Square();
                f.setColor(sq.color);
                f.fillRect(sq.x, sq.y, sq.side, sq.side);
            }
        }
    }
}
