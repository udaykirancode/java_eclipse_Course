package cllglo_programs;
import java.util.*;

public class Perfect_num {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.print("enter a number N :");
		try {
		int n=s.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.print("the number is Perfect");
		}
		else {
			System.out.print("the number is not Perfect");
		}
		}
		catch(Exception e) {
			System.out.print("the input is must be Integer");
		}
	}

}
