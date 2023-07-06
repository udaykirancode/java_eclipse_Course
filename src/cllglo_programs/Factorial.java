package cllglo_programs;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		try {
		System.out.print("enter a number n:");
		n=s.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		System.out.print("factorial of n is "+f);
		
		}
		catch(Exception e) {
			System.out.print("enter positive integer only");
		}
		

	}

}
