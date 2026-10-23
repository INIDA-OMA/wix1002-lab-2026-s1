package l2q5;

import java.util.Random;

public class RandomDigitSum {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10001);

        int originalNum = num1; 
        int sum = 0; 

        while (num1 > 0) {
            int r = num1 % 10; 
            sum += r;        
            num1 = num1 / 10;  
        }

        System.out.println("Random Number: " + originalNum);
        System.out.println("Sum of all digits: " + sum);
    }
}