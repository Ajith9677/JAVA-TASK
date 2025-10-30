package Git;

public class Task10 { //Find the sum of the series 1² + 2² + 3² + … + n².
    public static void main(String[] args) {
        int n =10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum of squares from 1 to " + n + " is: " + sum);
    }
}