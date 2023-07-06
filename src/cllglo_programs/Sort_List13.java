package cllglo_programs;
import java.util.*; 
public class Sort_List13 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter size of list:");
		int n=s.nextInt();
		String arr[]=new String[n+1];
		System.out.println("enter words in list:");
		for(int i=0;i<=n;i++) {
			arr[i]=s.nextLine();
		}
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.println(arr[i]);
		}
	}

}
