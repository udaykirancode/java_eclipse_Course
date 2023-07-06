package cllglo_programs;
import java.util.*;
public class Special_Chars {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a string:");
		String b="";
		String c="";
		int d=0;
		String a=s.nextLine();
		int l=a.length();
		for(int i=0;i<l;i++) {
			if(((int)a.charAt(i)>=97 & (int)a.charAt(i)<=122) |((int)a.charAt(i)>=65 & (int)a.charAt(i)<=89) ) {
				b+=a.charAt(i)+" ";
			}
			else {
				d+=1;
				c+=a.charAt(i)+" ";
			}
		}
		System.out.println("no.of special charcters is "+d);
		System.out.print("special charcters are :"+c);
	}

}
