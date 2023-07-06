package cllglo_programs;
import java.util.*;

public class No_Of_Vovwels25 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enetr a string :");
		String a=s.nextLine();
		int c=0;
		int l=a.length();
		for(int i=0;i<l;i++) {
			if(a.charAt(i)=='a'|a.charAt(i)=='e'|a.charAt(i)=='i'|a.charAt(i)=='o'|a.charAt(i)=='u'|
					a.charAt(i)=='A'|a.charAt(i)=='E'|a.charAt(i)=='I'|a.charAt(i)=='O'|a.charAt(i)=='U') {
				c+=1;
				
			}
		}
		System.out.print("No.of vowels in the given String is :"+c);
	}

}
