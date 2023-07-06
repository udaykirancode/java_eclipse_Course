package cllglo_programs;

public class skipping7_10 {

	public static void main(String[] args) {
		int m=50;
		int n=100;
		int i;
		for(i=m;i<n-8;i+=8) {
			System.out.print(i+",");
		}
		System.out.print("and "+i);
	}

}
