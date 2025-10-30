package Scanner;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double salary = s2.nextDouble();
		System.out.println(salary);
		
		if (salary>=200000 && salary <300000) {
			System.out.println("The manager salary");
		}else if (salary >=100000 && salary<200000) {
			System.out.println("The Team Lead salary");
		}else {
			System.out.println("Senior Associate");
		}
	}

}
