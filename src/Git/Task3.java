package Git;

public class Task3 { //Count the total number of digits in an integer.
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;

        number = Math.abs(number);
        
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10; 
                count++;
            }
        }
        System.out.println("Total digits: " + count);
    }
}

