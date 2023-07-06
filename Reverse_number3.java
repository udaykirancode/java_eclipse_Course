package cllglo_programs;
import java.util.*;
public class Reverse_number3 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=s.nextInt();
		int su=0;
		while(n>0) {
			int r=n%10;
			su=su*10+r;
			n/=10;
		}
		s.close();
		System.out.println(su);
	}
}
