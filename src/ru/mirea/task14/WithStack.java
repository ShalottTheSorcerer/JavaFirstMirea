package ru.mirea.task14;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class WithStack {
    public WithStack() {
    }

    public static void main(String[] args) {
        Stack first = new Stack();
        Stack second = new Stack();
        Scanner scn = new Scanner(System.in);
        String string1 = scn.nextLine();
        int size1 = string1.length() - 1;
        String string2 = scn.nextLine();
        int size2 = string2.length() - 1;
        int count = 0;

        int i;
        for(i = 0; i < 5; ++i) {
            if (string1.charAt(size1) - 48 != 0) {
                first.push(string1.charAt(size1) - 48);
            } else {
                first.push(10);
            }

            size1 -= 2;
        }

        for(i = 0; i < 5; ++i) {
            if (string2.charAt(size2) - 48 != 0) {
                second.push(string2.charAt(size2) - 48);
            } else {
                second.push(10);
            }

            size2 -= 2;
        }

        for(; count < 106; ++count) {
            if (first.empty()) {
                System.out.print("\n--\n\n");
                System.out.print("second " + count);
                break;
            }

            if (second.empty()) {
                System.out.print("\n--\n\n");
                System.out.print("first " + count);
                break;
            }

            if ((Integer)first.peek() > (Integer)second.peek()) {
                first.add(0, first.pop());
                first.add(0, second.pop());
            } else {
                second.add(0, first.pop());
                second.add(0, second.pop());
            }
        }

        if (count == 106) {
            System.out.print("botva");
        }

    }
}
