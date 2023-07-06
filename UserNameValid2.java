package cllglo_programs;
import java.util.*;
public class UserNameValid2 {
	public static void main(String [] args) {
		String a,b;
		Scanner z=new Scanner(System.in);
		System.out.println("enter a Username :");
		a=z.nextLine();
		System.out.println("Renter the Username :");
		b=z.nextLine();
		z.close();
		if(a.contentEquals(b)) {
			System.out.println("the string is valid");
		}
		else {
			System.out.println("the string  is not valid");
		}		
	}
}