package l2q1;

import java.util.Scanner; 

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter fahrenheit: ");
        double f = sc.nextDouble(); 
        double c = (f - 32) / 1.8;
        System.out.printf("Celsius = %.2f\n", c);
        //%.2f means print out in 2 decimal places
        //System.out.printf("Name: %s, Age: %d, Score: %.2f, Grade: %c\n", name, age, score, grade);

        sc.close(); 
    }
}

/* Teacher's example 
import java.util.Locale;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf(Locale.US, "Celsius: %.2f%n", celsius);
    }
}
 */