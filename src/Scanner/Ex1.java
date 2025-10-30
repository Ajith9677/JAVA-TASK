package Scanner;

import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter college name");
		String college = s.nextLine();
		System.out.println(college);
		
		if (college.equalsIgnoreCase("ANNA UNIVERSITY")) {
			System.out.println("I am studying this college");
		}else if (college.equalsIgnoreCase("MANIPAL UNIVERSITY")) {
			System.out.println("I am studying this college");
		}else {
			System.out.println(" I am not studying this college");
		}
			
		
		
		
	}
	


}
