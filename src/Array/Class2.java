package Array;

public class Class2 {
	public static void main(String[] args) {
		
		int[][] aa = new int[3][3];
		
		aa[0][0]=1;
		aa[0][1]=4;
		aa[0][2]=5;
		aa[1][0]=8;
		aa[1][1]=12;
		aa[1][2]=15;
		aa[2][1]=25; 
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(aa[i][j]+" ");
			}
			System.out.println();
		}

	}

}
