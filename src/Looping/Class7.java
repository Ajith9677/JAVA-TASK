package Looping;

public class Class7 {
	
       public static void Starpattern1() {
		
		for (int i=1; i<=5;i++) {
			
			for (int j=0;j<i;j++) {               // <3
				System.out.print("*");
			}
			System.out.println();
		}
	
		for (int i=4;i>=1;i--) {
			
			for (int j=0; j<i;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
       
	  public static void main(String[] args) {
		
		Starpattern1();
	}

}

