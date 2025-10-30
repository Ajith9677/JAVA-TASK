package Axess;

public class Car {
	public void carname() {
		System.out.println("maruti");
		System.out.println("audi");
		System.out.println("hyundai");
		
	}
	public void model() {
		System.out.println("ABC");
		System.out.println("XYX");
		System.out.println("XYZZ");
		
	}
	public void year() {
		System.out.println("1965");
		System.out.println("1970");
		System.out.println("1975");
		
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carname();
		c1.model();
		c1.year();
		
		Employees emp = new Employees();
		emp.EmployeeId();
		emp.Employeename();
	}
		
	}
		
