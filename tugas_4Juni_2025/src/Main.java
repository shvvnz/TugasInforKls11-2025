import java.util.Scanner;
import models.Inductor;
import models.Capacitor;
import models.Impedance;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Kalkulator Reaktansi dan Impedansi (ω) =====");
            System.out.println("1. Hitung Reaktansi Induktif (XL = ω x L)");
            System.out.println("2. Hitung Reaktansi Kapasitif (XC = 1 / (ω x C))");
            System.out.println("3. Hitung Impedansi Total");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan kecepatan sudut ω (rad/s): ");
                    double omega1 = scanner.nextDouble();
                    System.out.print("Masukkan induktansi L (Henry): ");
                    double L = scanner.nextDouble();
                    double xl = Inductor.calculateXL(omega1, L);
                    System.out.printf("Reaktansi Induktif (XL) = %.2f Ohm\n", xl);
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan sudut ω (rad/s): ");
                    double omega2 = scanner.nextDouble();
                    System.out.print("Masukkan kapasitansi C (Farad): ");
                    double C = scanner.nextDouble();
                    double xc = Capacitor.calculateXC(omega2, C);
                    System.out.printf("Reaktansi Kapasitif (XC) = %.2f Ohm\n", xc);
                    break;
                case 3:
                    System.out.print("Masukkan tahanan resistor R (Ohm): ");
                    double R = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan sudut ω (rad/s): ");
                    double omega3 = scanner.nextDouble();
                    System.out.print("Masukkan induktansi L (Henry): ");
                    double Lz = scanner.nextDouble();
                    System.out.print("Masukkan kapasitansi C (Farad): ");
                    double Cz = scanner.nextDouble();
                    double z = Impedance.calculateZ(R, omega3, Lz, Cz);
                    System.out.printf("Impedansi Total (Z) = %.2f Ohm\n", z);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
