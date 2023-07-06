package cllglo_programs;
import java.util.*;
public class Reverse_String {
	public static void main(String[] args) {
		String a;
		String b="";
		char c;
		System.out.print("enter a string:");
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		int l=a.length();
		for(int i=l-1;i>=0;i--) {
			c=(char)a.charAt(i);
			b+=c;
		}
		System.out.println(b);
		s.close();
	}

}
