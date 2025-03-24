class Base{

private void m(){

System.out.println("HEllo");
}
}

class supthis extends Base{

void supthis(){
super();

}

private void m(){


System.out.println("HEllo i am base");
}

public static void main(String [] a){
	supthis s=new supthis();
	s.m();
		
}

}