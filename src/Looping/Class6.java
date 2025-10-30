package Looping;

public class Class6 {
	
	public static void Starpattern() {
		
		for (int i=1;i<=5;i++) {
			
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		Starpattern();
	}

}
