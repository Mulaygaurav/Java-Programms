class thr4{
public static void main(String [] a){

int m=0;
System.out.println("in main");
m=printAvg(100,0);
System.out.println("m:"+m);
System.out.println("End of  main");
}

public static int printAvg(int i,int j){

int k=0;
try{
System.out.println("in PrintfAvg");
k=computeAvg(i,j);
System.out.println("k:" + k);
return k;
}
finally{
k=3;
return k*2;
}
}

public static int computeAvg(int m,int n){

System.out.println("computing......");
if(n==0){
throw new ArithmeticException();
}else{
return m/n;
}}}