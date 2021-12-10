package ru.mirea.task17;

enum Planet{
    Mercury(3.33022e23, 2439.7),
    Venus(4.8675e24, 6051.8),
    Earth(5.9726e24, 6371.0),
    Mars(6.4171e23, 3389.5),
    Jupiter(1.8986e27, 69911.0),
    Saturn(5.6846e26, 58232.0),
    Uranus(8.6813e25, 25362.0),
    Neptune(1.0243e26, 24622.0);
    private double radius;
    private double weight;
    Planet(double w, double r) {
        weight = w;
        radius = r;
    }
    private double G = 6.67430e-11;
    public double AttentionForce() {
        return (G * weight) / (radius * radius) / 1e6;
    }
}

