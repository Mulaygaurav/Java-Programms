import java.util.*;
import java.lang.*;

public class DuplicateRemove{
 public static void dR(int a[]){
   HashSet<Integer> shaset = new HashSet<>();
    HashSet<Integer> shaset1 = new HashSet<>();
    for(int b: a){
      if(!shaset.add(b)){
          shaset1.add(b);
	}else{
        shaset.add(b);
	}
	 }
	for(int c: shaset){
	 System.out.print(c + " " );
	}
	}
 public static void main(String [] args){
 int a [] ={1,2,3,4,5,3,4,2,4,5,5,6,2,6,4,3,2,3,4,5,6,6,7,7,8,8,8};
  dR(a);
}
}