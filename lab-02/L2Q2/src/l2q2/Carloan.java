package l2q2;

import java.util.Locale;
import java.util.Scanner;

public class Carloan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter car price (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter down payment (D): ");
        double d = sc.nextDouble();

        System.out.print("Enter annual interest rate in % (R): ");
        double r = sc.nextDouble();

        System.out.print("Enter loan duration in years (Y): ");
        int y = sc.nextInt();

        double m = (p - d) * (1 + r * y / 100) / (y * 12);

        System.out.printf(Locale.US, "Monthly Payment = %.2f%n", m);
        //in printf use %n to add a new line instead of using \n

        sc.close();
    }
}