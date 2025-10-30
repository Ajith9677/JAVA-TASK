package Looping;

public class Class11 {
	
	public static void main(String[] args) {
		
		String name = "ajith kumar";
		
		int count =0;
		
		for (int i=0; i< name.length(); i++) {
			System.out.println(name.charAt(i));
			
			char n=name.charAt(i);
			
			if ('a'== n) {
				count++;
				
			}
		}
		System.out.println("count==>"+count);
	}

}
