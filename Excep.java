import java.util.*;
class Excep{

public static void main(String [] a){

	 int n = 10;
        int m = 0;

        try {
          
            // Code that may throw an exception
            int ans = n / m;
            System.out.println("Answer: " + ans);
        }
        catch (ArithmeticException e) {
          
            // Handling the exception
            System.out.println(e);
        }


finally {
            System.out.println(
                "Program continues after handling the exception.");
        }
        

}
}