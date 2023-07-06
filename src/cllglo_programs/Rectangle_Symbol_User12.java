package cllglo_programs;
import java.util.*;
public class Rectangle_Symbol_User12 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a symbol:");
		char ch=s.next().charAt(0);
		System.out.print("enter no.of rows:");
		int r=s.nextInt();
		System.out.print("Enter no.of columns:");
		int c=s.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0 | j==0 | i==r-1 | j==c-1) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
