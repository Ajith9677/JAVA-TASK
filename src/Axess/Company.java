package Axess;

public class Company {
	public void salaryInfo() {
		int salary =60000;
		if (salary >=200000) {
			System.out.println("Manager position");
			
		}else if (salary >=100000) {
			System.out.println("Team Lead position");
		}else if (salary >=50000) {
			System.out.println("Senior Associate");
		}else
			System.out.println("Associate");	
	}
	public static void main(String[] args) {
		Company c2 = new Company ();
		c2.salaryInfo();
	}
}
	

