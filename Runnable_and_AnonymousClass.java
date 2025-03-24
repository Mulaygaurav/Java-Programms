public class Runnable_and_AnonymousClass{

public static void main(String [] args){

Runnable obj1=new Runnable(){
		public void run(){

 	 for(int i=1;i<=50;i++){
		System.out.println("hi");
		try{
		Thread.sleep(10);
		}
	   	catch(InterruptedException e){
		System.out.println(e);
		}
		}
  		}
	};

Runnable obj2=new Runnable(){
		public void run(){

 	 for(int i=1;i<=50;i++){
		System.out.println("Gaurav");
		try{
		Thread.sleep(10);
		}
	   	catch(InterruptedException e){
		System.out.println(e);
		}
		}
  		}
	};

Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);

t1.start();
t2.start();

}}