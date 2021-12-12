package ru.mirea.task23;

public class WineTest {
    public static void main(String args[]) {
        Wine dragon_blood = new Wine("Dragon blood", "Dragon.inc", 1994, 25);
        Wine the_wing = new Wine("The saint's wing", "Horns and hoofs", 2015, 2);
        Wine another_dragon_blood = new Wine("Dragon blood", "Dragon.inc", 1994, 25);
        Wine luxury_wine = new Wine("Chateau D'or", "Some fancy name", 1889, 1500);
        Wine more_luxury_wine = new Wine("Chateau Presto", "Some fancy name", 1889, 1250);
        dragon_blood.equation(the_wing);
        luxury_wine.equation(luxury_wine);
        the_wing.equation(luxury_wine);
        luxury_wine.equation(more_luxury_wine);
        dragon_blood.equation(another_dragon_blood);
    }
}
