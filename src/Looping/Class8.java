package Looping;

public class Class8 {
	
	public static void Starpattern2() {

		for (int i=5; i>=1;i--) {
			
			for (int j=1;j<=i;j++) {               // <3
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
       
	  public static void main(String[] args) {
		
		Starpattern2();
	}

}
		
		
