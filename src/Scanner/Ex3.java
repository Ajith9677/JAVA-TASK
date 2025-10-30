package Scanner;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Enter your mobile number");
	    long number = s2.nextInt();
		System.out.println("number====>"+number);
		
		if (String.valueOf(number).length()==9) {
			System.out.println("Valid mobile number");
		}else {
			System.out.println("Not valid mobile number");
		}
	}

}
