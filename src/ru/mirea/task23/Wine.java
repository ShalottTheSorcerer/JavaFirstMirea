package ru.mirea.task23;

public class Wine {
    private int year;
    private int dollar_price;
    private String brand;
    private String name;
    public String getName() {
        return name;
    }
    Wine (String n, String b, int y, int p) {
        name = n;
        brand = b;
        year = y;
        dollar_price = p;
    }
    public int hashCode() {
        int result = brand.hashCode();
        result += name.hashCode();
        result += year;
        result += dollar_price;
        return result;
    }
    public Boolean equals(Wine new_wine) {
        if (this.hashCode() == new_wine.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
    public void equation(Wine new_wine) {
        System.out.println("The first wine is: "+this.getName());
        System.out.println("The second wine is: "+new_wine.getName());
        System.out.println("The hash code for the first wine is: "+this.hashCode());
        System.out.println("The hash code for the second wine is: "+new_wine.hashCode());
        System.out.println("The result of the equation is: "+this.equals(new_wine)+"\n");
    }
}
