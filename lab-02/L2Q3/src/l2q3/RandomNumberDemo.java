package l2q3;

import java.util.Random;
import java.util.Locale;

public class RandomNumberDemo {
    public static void main(String[] args) {
        Random random = new Random();

        //41 mean total 41 numbers from 10-50, and +10 means start from 10
        int num1 = random.nextInt(41)+10;
        int num2 = random.nextInt(41)+10;
        int num3 = random.nextInt(41)+10;

        int sum = num1 + num2 + num3;

        double average = sum / 3.0;

        System.out.printf("The three random numbers are: %d, %d, %d%n", num1, num2, num3);
        System.out.println("Sum = " + sum);
        System.out.printf(Locale.US, "Average = %.2f%n", average);
    }
}

/*
package l2q3;

import java.util.Random;
import java.util.Locale;

public class UniqueRandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(41) + 10;

        int num2;
        do {
            num2 = random.nextInt(41) + 10;
        } while (num2 == num1);

        int num3;
        do {
            num3 = random.nextInt(41) + 10;
        } while (num3 == num1 || num3 == num2);

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("The three unique random numbers are: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum = " + sum);
        System.out.printf(Locale.US, "Average = %.2f%n", average);
    }
}
*/