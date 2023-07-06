
package cllglo_programs;
import java.util.*;


public class Sample {
	public static void main(String [] args) {
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("enter a number at 11th index of ");
			arr[10]=s.nextInt();
			
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}

}
 