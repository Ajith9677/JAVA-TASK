package Looping;

public class Class2 {
	public static void main(String[] args) {
		
		int count =0;
		
		for (int i=0; i<=100; i++) {
			if(i%2 == 1) {
			System.out.println(i);
			
			count+=i;
		}
		System.out.println("count==>"+count);
	}

}

}