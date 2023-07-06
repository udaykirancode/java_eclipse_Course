package cllglo_programs;
import java.util.*;
public  class Sum_Digits41 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		System.out.print("enter no.of digits :");
		int n=s.nextInt();
		System.out.print("enter a number :");
		int N=s.nextInt();
		int m=N;
		while(N>0) {
			N/=10;
			c+=1;
		}
		int U=0;
		if(n==c) {
			while(m>0) {
				int r=m%10;
				U+=r;
			}
			System.out.print("sum of digits is :"+U);
		}
		else {
			System.out.print("no.of digits in given number not equal to no.of digits given");
		}
	}
	

}
