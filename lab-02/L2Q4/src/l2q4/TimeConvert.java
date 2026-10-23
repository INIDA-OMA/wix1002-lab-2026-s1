package l2q4;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long s = sc.nextLong();

        long hours = s / 3600;
        long minutes = (s % 3600) / 60;
        long seconds = s % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n", s, hours, minutes, seconds);
    }
    
}
