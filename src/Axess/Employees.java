package Axess;

public class Employees extends Company {
	public void Employeename () {
		System.out.println("Ameer");
	}
	public void EmployeeId () {
		System.out.println("12345");
	}
	public static void main(String[] args) {
		Employees info = new Employees ();
		info.Employeename();
		info.EmployeeId();
	}
	

}
