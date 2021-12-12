package ru.mirea.task21;

import java.util.LinkedList;
import java.util.Scanner;

public class SubwayStationsTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lines = new LinkedList<String> ();
        lines.add("Koltsevaya");
        lines.add("Lyublinsko-Dmitrovskaya");
        lines.add("Kalininsko-Solntsevskaya");
        lines.add("Serpukhovsko-Timiryazevskaya");
        lines.add("Gorkovsko-Zamoskvoretskaya");
        boolean chet = true;
        System.out.println("The list starts with number 0. Do you want even lines? (1/0)");
        int bool = sc.nextInt();
        if (bool != 1) chet = false;
        SubwayStations list = new SubwayStations(lines, chet);
        list.PrintList();
    }
}
