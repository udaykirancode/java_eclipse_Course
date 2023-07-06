package cllglo_programs;
import java.util.*;
import java.time.*;
public class Leap_Year {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a date in format of dd-mm-yyyy :");
		String date=s.nextLine();
		String arr[]=date.split("-");
		int dd=Integer.parseInt(arr[0]);
		int mm=Integer.parseInt(arr[1]);
		int yy=Integer.parseInt(arr[2]);
		try {
		LocalDate Date=LocalDate.of(yy, mm, dd);
		if(yy%400==0) {
			System.out.print("the year is leap year");
			
		}
		else if(yy%100!=0) {
			if(yy%4==0) {
				System.out.print("year is leap year");
			}
			else {
				System.out.print("not a leap year");
			}
		}
		else {
			System.out.print("not a leap year");
		}
		}
		catch(Exception e){
			System.out.print("invalid date");
		}
		
		
	}

}
