package models;

public class Impedance {
    public static double calculateZ(double resistance, double frequency, double inductance, double capacitance) {
        double xl = Inductor.calculateXL(frequency, inductance);
        double xc = Capacitor.calculateXC(frequency, capacitance);
        double reactance = xl - xc;
        return Math.sqrt(resistance * resistance + reactance * reactance);
    }
}
