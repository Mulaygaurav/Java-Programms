// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ArrayOfObjects{
    public static void main(String[] args) {
        
       gaurav g1=new gaurav();
       g1.name="Gaurav";
       g1.marks=90;
      
      gaurav g2=new gaurav();
        g2.name="Harshal";
       g2.marks=70;
      gaurav g3=new gaurav();
        g3.name="Nikhil";
       g3.marks=80;
      gaurav g4=new gaurav();
        g4.name="Saurabh";
       g4.marks=100;
      gaurav g5=new gaurav();
        g5.name="Payal";
       g5.marks=50;
      
      gaurav G[]=new gaurav[5];
      G[0]=g1;
      G[1]=g2;
      G[2]=g3;
      G[3]=g4;
      G[4]=g5;
      
      for(int i=0;i<G.length;i++){
          System.out.println( G[i].name +  " : "  + G[i].marks);
      }
        
    }
}


class gaurav{
  
  
  String name;
  int marks;
  
  
}