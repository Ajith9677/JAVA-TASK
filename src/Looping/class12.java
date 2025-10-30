package Looping;

public class class12 {
		
		public static void main(String[] args) {
			
			String name = "Software testing is a systematic process of evaluating a software application to ensure it functions correctly, securely, and efficiently according to its specified requirements. The primary goal is to identify defects, errors, or missing functionalities and verify that the software meets user expectations and business needs";
			
			int count =0;
			
			for (int i=0; i< name.length(); i++) {
				System.out.println(name.charAt(i));
				
				char n=name.charAt(i);
				
				if ('t'== n) {
					count++;
					
				}
			}
			System.out.println("count==>"+count);
		}

}
