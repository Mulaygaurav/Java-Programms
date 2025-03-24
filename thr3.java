class thr3{

public static void main(String []s){

int f=10,g=5,c=3;


try{

c=f/g;
System.out.println(c);
}
catch(ArithmeticException a){
System.out.println(a);
}
System.out.println(c);


}
}