package cllglo_programs;
import java.util.*;
public class reverse_alphebets38 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a string:");
		String a=s.nextLine();
		a=a.toLowerCase();
		int l=a.length();
		String arr[]=a.split("");
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.print("The reverse order of alphabets :");
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[0]);
			
	}
		
}
