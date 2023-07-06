package cllglo_programs;
import java.util.*;
public class Vowels_AND_Consanants26 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String c="";
		String v="";
		
		System.out.print("enter a String :");
		String a=s.nextLine();
		int l=a.length();
		for(int i=0;i<l;i++) {
			if(a.charAt(i)=='a'|a.charAt(i)=='e'|a.charAt(i)=='i'|a.charAt(i)=='o'|a.charAt(i)=='u'|
					a.charAt(i)=='A'|a.charAt(i)=='E'|a.charAt(i)=='I'|a.charAt(i)=='O'|a.charAt(i)=='U') {
				v+=a.charAt(i)+" ";
			}
			else {
				c+=a.charAt(i)+" ";
			}
		}
		System.out.println("vowels are : "+v);
		System.out.print("Consants are : "+c);
	}

}
