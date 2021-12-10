package ru.mirea.task17;

import java.util.Scanner;

public class PlanetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the planet: ");
        String planet = sc.nextLine();
        System.out.println("Gravity on " + planet+ " equals " + Planet.valueOf(planet).AttentionForce() + " m/s^2");
    }
}
