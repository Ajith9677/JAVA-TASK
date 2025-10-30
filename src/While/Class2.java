package While;

public class Class2 {
	public static void main(String[] args) {
		
		
		int n= 1234;
		
		int rev=0;
		
		while (n>0) {
			
			int c= n%10;
			n=n/10;
			
			rev = rev*10+c;
			//System.out.println(n);
		}
		System.out.println(rev);
	}

}
