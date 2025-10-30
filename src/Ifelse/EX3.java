package Ifelse;

public class EX3 {
	public static void main(String[] args) {
		
		int mark =34;
		
		if (mark>=80 && mark <=100) {
			System.out.println("A grade");
		}else if (mark>=70 && mark<80) {
			System.out.println("B grade");
		}else if (mark>=50 && mark<70) {
			System.out.println("C grade");
		}else if (mark>=35 && mark<=50) {
			System.out.println("D grade");
		}else {
			System.out.println("Fail");
		}
		
	}

}
