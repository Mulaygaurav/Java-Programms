//interface 

interface abc{
void m1();
void m2();

default void m3(){
System.out.println("I am m3");
}
}

class Abc2 implements abc{

public void m1(){
System.out.println("I am m1");
}
public void m2(){
System.out.println("I am m2");
}

public static void main(String args[]){

Abc2 a =new Abc2();
a.m1();
a.m3();
a.m2();

}
}