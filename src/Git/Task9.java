package Git;

import java.util.Scanner;

public class Task9 { //Generate and print the Fibonacci series up to a given limit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + limit + ":");
        
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}
