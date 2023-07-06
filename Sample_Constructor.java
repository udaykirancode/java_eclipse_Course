package cllglo_programs;

public class Sample_Constructor {
	static int c;
	Sample_Constructor(){
		System.out.println("parameter less constructor");
	}
	Sample_Constructor(int a,int b){
		this.c=30;
		System.out.println("The sum is "+c);
	}
	static void ex(){
		System.out.println("this is a method");
	}
	public static void main(String [] args) {
		Sample_Constructor s1= new Sample_Constructor();
		Sample_Constructor s2= new Sample_Constructor(2,9);
		ex();
		ex();
		
	}

}
