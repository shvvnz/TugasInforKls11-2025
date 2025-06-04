package models;

public class Capacitor {
    public static double calculateXC(double w, double C) {
        return 1 / (w * C);
    }
}
