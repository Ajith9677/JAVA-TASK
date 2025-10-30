package Products;

import Axess.Company;
import Axess.Employees;

public class ProductDetails extends Company{
	public void productname() {
		System.out.println("XYZ");
	}
	public static void main(String[] args) {
		ProductDetails pro = new ProductDetails ();
		pro.productname();
		
		
		Employees emp = new Employees();
		emp.EmployeeId();
		emp.Employeename();

		}

}
