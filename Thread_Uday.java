package cllglo_programs;
import java.util.*;
public class Thread_Uday {
	public static void main(String [] args)throws InterruptedException{
		PrCr pc=new PrCr();
		Thread t1=new Thread(new Runnable(){
			public void run() {
				try {
					pc.pr();
				}
				catch(InterruptedException e) {
					System.out.print(e);
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				try {
					pc.cr();
					
				}
				catch(InterruptedException e) {
					System.out.print(e);
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	public static class PrCr{
		LinkedList<Integer> list= new LinkedList<>();
		final int c=2;
		public void pr() throws InterruptedException {
			int val=0;
			while(true) {
				synchronized(this) {
					while(list.size()==c) 
						wait();
						
					list.add(val++);
					System.out.println("producer produced "+val);
					notify();
					Thread.sleep(1000);
				}
			}
		}
		public void cr() throws InterruptedException{
			while(true) {
				synchronized(this) {
					while(list.size()==0)
						wait();
					int valu=list.removeFirst();
					System.out.println("Consumer consumed "+valu);
					notify();
					Thread.sleep(1000);	
				}
			}
		}
	}
}