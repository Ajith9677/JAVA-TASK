package Git;

import java.util.Scanner;

public class Task4 { //Calculate the sum of digits of a given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; 
            sum += digit;          
            temp /= 10;             
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

