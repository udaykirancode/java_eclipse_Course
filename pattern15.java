package cllglo_programs;

public class pattern15 {

	public static void main(String[] args) {
		int r=4;
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		r=r-1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r-i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}

	}

}
