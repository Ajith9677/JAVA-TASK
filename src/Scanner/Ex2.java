package Scanner;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		String name2 = s1.next();
		System.out.println(name2);
		
		
		if (name2.equals("AJITH KUMAR")) {
			System.out.println("This is my name");
		}else if (name2.equals("AJITH")){
			System.out.println("This is also my name");
		}else {
			System.out.println("This is not my name");
		}
			
		
		
		
		
		
	}

}
