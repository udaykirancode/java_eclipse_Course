package cllglo_programs;
import java.util.*;
public class composite_Numbers17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter low range:");
		int a=s.nextInt();
		System.out.print("enter high range:");
		int b=s.nextInt();
		for(int i=a+1;i<b-1;i++) {
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					System.out.print(i+", ");
					break;
				
				}
			}
		}
		for(int i=2;i<(b)/2;i++) {
			if((b-1)%i==0) {
				System.out.print(b-1);
				break;
			}
		}

	}

}
