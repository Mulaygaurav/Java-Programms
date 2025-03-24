class A extends Thread{

 public void run(){
   for(int i=0;i<=50;i++){
	System.out.println("hi");
		try{
		Thread.sleep(10);
		}
	   	catch(InterruptedException e){
		System.out.println(e);
		}
}
}
}
class B extends Thread{

 public void run(){
   for(int i=0;i<=50;i++){
	System.out.println("Gaurav");
		try{
		Thread.sleep(11);
		}
	   	catch(InterruptedException e){
		System.out.println(e);
		}

}
}
}


public class Multiple_Thread{

public static void main(String [] args){

A obj1=new A();
B obj2=new B();

obj1.start();
obj2.start();

}}