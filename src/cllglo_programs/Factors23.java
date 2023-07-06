package cllglo_programs;
import java.util.*;
public class Factors23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		System.out.print("enter a number N:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c+=1;
			}
		}
		System.out.print("Total factors are :"+c);

	}

}
