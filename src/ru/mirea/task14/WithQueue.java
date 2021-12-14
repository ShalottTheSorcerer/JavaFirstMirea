package ru.mirea.task14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WithQueue {
    public WithQueue() {
    }

    public static void main(String[] args) {
        Queue<String> first = new LinkedList();
        Queue<String> second = new LinkedList();
        Scanner scn = new Scanner(System.in);
        String string1 = scn.nextLine();
        int size1 = 0;
        String string2 = scn.nextLine();
        int size2 = 0;
        int count = 0;

        char c;
        int i;
        for(i = 0; i < 5; ++i) {
            if (string1.charAt(size1) - 48 != 0) {
                c = string1.charAt(size1);
                first.add(Integer.toString( c - 48));
            } else {
                first.add("10");
            }

            size1 += 2;
        }

        for(i = 0; i < 5; ++i) {
            if (string2.charAt(size2) - 48 != 0) {
                c = string2.charAt(size2);
                second.add(Integer.toString( c - 48));
            } else {
                second.add("10");
            }

            size2 += 2;
        }

        for(; count < 106; ++count) {
            if (first.isEmpty()) {
                System.out.print("\n--\n\n");
                System.out.print("second " + count);
                break;
            }

            if (second.isEmpty()) {
                System.out.print("\n--\n\n");
                System.out.print("first " + count);
                break;
            }

            if (Integer.parseInt((String)first.element()) > Integer.parseInt((String)second.element())) {
                first.add((String)first.remove());
                first.add((String)second.remove());
            } else {
                second.add((String)first.remove());
                second.add((String)second.remove());
            }
        }

        if (count == 106) {
            System.out.print("botva");
        }

    }
}
