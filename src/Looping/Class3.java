package Looping;

public class Class3 {
	public static void main(String[] args) {
		
		String name ="ajith kumar";
		
		String n= "";
		
		for (int i=name.length()-1; i>=0; i--) {
              n=n+name.charAt(i);
              System.out.println(n);
			//System.out.print(name.charAt(i));			
		}
		
	}
}
