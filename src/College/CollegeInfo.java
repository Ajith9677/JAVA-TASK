package College;

public class CollegeInfo {
	public static void main(String[] args) {
		int salary =20000;
		if (salary>=200000 && salary <=300000) {
			System.out.println("Manager");
		}else if (salary >=100000 && salary <200000) {
			System.out.println("Team Lead");
		}else if (salary >=50000 && salary <100000) {
			System.out.println("Senior Associate");
		}else {
			if (salary<=10000) {
				System.out.println("admin");
		}else {
			System.out.println("Associate");
		}
		
		}
	}
}


