package cllglo_programs;

public class Inverted_Pyramid {

	public static void main(String[] args) {
		int r=8;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r-i;j++) {
				if(j>=i)
				System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
