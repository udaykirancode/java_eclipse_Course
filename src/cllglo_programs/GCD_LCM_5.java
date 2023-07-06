package cllglo_programs;
import java.util.*;
public class GCD_LCM_5 {
	public static void main(String [] args) {
		System.out.print("eneter no.of elements:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter number "+i+":");
			arr[i]=s.nextInt();
		}
		int flag=0;
		GCD_LCM_5 l=new GCD_LCM_5();
		l.lcm(arr,n);
		int m=l.max(arr, n);
				
		l.gcd(arr, n,m);
	}
	int max(int arr[],int n) {
		int maxi=0;
		for(int i=0;i<n;i++) {
			if(maxi<arr[i]) {
				maxi=arr[i];
			}
		}
		return maxi;
	}
	void gcd(int arr[],int n,int m) {
		int flag=0;
		int j=m;
		while(j>0) {
			for(int i=0;i<n;i++) {
				if(arr[i]%j!=0) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==0) {
				System.out.println("gcd is "+j);
				break;
			}
			j--;
		}
	}
	void lcm(int arr[],int n) {
		int flag=0;
		int j=2;
		while(j>1){
			for(int i=0;i<n;i++) {
				if(j%arr[i]!=0) {
					flag=1;
					
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==0) {
				System.out.println("lcm is "+j);
				break;
			}
			j++;
		}
	}

}
