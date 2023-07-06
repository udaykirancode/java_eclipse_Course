package cllglo_programs;

public class pattern32 {
	public static void main(String []args) {
		int r=5;
		int k=1;
		for(int i=1;i<r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k*k+" ");
				k+=1;
			}
			System.out.println();
		}
	}
}