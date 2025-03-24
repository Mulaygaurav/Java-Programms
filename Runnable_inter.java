class A implements Runnable{

public void run(){

  for(int i=1;i<=50;i++){
	System.out.println("Hello");
	try{
		Thread.sleep(10);
		}
	   catch(InterruptedException e){
		System.out.println(e);
	}
	}
  }
}


class B implements Runnable{

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
}


public class Runnable_inter{

public static void main(String [] args){

Runnable obj1=new A();
Runnable obj2=new B();

Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);

t1.start();
t2.start();

}
}
