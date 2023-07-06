package cllglo_programs;

public class LCM5 {
	public static void main(String [] args) {
		int a=6,b=20;
		int i=b;
		while(i>0) {
			if(i%a==0 && i%b==0) {
				System.out.print(i);
				break;
			}
			i++;
		}
	}
}
