package cllglo_programs;
import java.util.*;
public class RemoveVowels39 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String b="";
		String c="";
		System.out.print("enter a String :");
		String a=s.nextLine();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'|a.charAt(i)=='e'|a.charAt(i)=='i'|a.charAt(i)=='o'|a.charAt(i)=='u'|
					a.charAt(i)=='A'|a.charAt(i)=='E'|a.charAt(i)=='I'|a.charAt(i)=='O'|a.charAt(i)=='U') {
				
				
			}
			else {
				c+=a.charAt(i);
			}
		}
		System.out.print("String after remove vowels :"+c);
		
		
	}

}
