package ru.mirea.task21;

import java.util.LinkedList;

public class SubwayStations {
    private LinkedList<String> lines;
    private boolean chet;
    SubwayStations (LinkedList<String> l, boolean c) {
        lines = l;
        chet = c;
    }
    public void PrintList() {
        for (int i = 0; i < lines.size(); i++) {
            if (chet) {
                if ((i % 2) == 0) System.out.println(lines.get(i));
            } else {
                if ((i % 2) != 0) System.out.println(lines.get(i));
            }
        }
    }
}
