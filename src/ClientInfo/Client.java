package ClientInfo;

public class Client {
	public void VotingInfo() {
		
		int age=25;
		if (age>=18) {
			System.out.println("Eligible for voting");
		}else
			System.out.println("Not eligible for voting");
		
	}
	public static void main(String[] args) {
		Client c1 = new Client ();
		c1.VotingInfo();
	}

}
