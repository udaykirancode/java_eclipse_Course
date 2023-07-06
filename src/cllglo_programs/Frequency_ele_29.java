 package cllglo_programs;
import java.util.*;
public class Frequency_ele_29 {
	public static void main(String [] args) {
		int arr[]= {1,2,8,3,2,2,2,5,1};
		int arrr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]) {
					c+=1;
				}
			}
			arrr[i]=c;
		}
		System.out.println("------------------\nElement |Frequency\n------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("|"+arr[i]+"\t|\t"+arrr[i]+"|");
		}
		System.out.print("------------------");
		
	}
}