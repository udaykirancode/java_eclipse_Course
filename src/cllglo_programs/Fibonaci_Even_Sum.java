package cllglo_programs;
import java.util.*;
public class Fibonaci_Even_Sum {
	public static void main(String []args) {
		System.out.print("enter no.of elements to be added:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [2*n+1];
		arr[0]=0;
		arr[1]=1;
		int sum=0;
		for(int i=2;i<=42*n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		for(int j:arr) {
			System.out.print("\t"+j);
		}
		System.out.print("\nsum of "+n+" even elements is "+sum);
	}

}
