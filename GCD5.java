package cllglo_programs;

public class GCD5 {
	public static void main(String []args) {
		int a=4,b=16;
		for(int i=b;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
