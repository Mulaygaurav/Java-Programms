//Absract class

abstract class Xyz{
void m(){
System.out.println("m");
}
abstract void m1();
abstract void m2();
}

class Abc extends Xyz{

public void m1(){
System.out.println("I am m1");
}

public void m2(){
System.out.println("I am m2");
}


public static void main(String [] args){

Abc a=new Abc();
a.m1();
a.m();
a.m2();

}
}