package cllglo_programs;
import java.util.*;
public class Negative_Fibonaccie {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		arr[0]=0;
		arr[1]=-1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
