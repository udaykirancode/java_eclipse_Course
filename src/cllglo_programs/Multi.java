package cllglo_programs;

class Multi implements Runnable{  
public void run(){ 
System.out.println("thread is running..."); 

}  
public static void main(String args[]) throws InterruptedException{  
Multi t1=new Multi();  
Thread t2=new Thread(t1);
t2.start();  
t2.sleep(1000);
t1.run();
t1.run();
//t1.start();
//t1.run();
 }  
}  