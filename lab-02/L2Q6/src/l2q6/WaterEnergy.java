package l2q6;

import java.util.Locale;
import java.util.Scanner;

public class WaterEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the amount of water in gram: ");
        double gram = sc.nextDouble();
        double M = gram / 1000.0;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = sc.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = sc.nextDouble();

        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double Q = M * (finalC - initialC) * 4184;

        System.out.printf("The energy needed is %.6eJ%n", Q);

        sc.close();
    }
}