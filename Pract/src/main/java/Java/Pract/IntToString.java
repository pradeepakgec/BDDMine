package Java.Pract;
import java.util.*;
import java.security.*;

public class IntToString {
	 public static void main(String[] args) {
	  try {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	   in.close();
	   //String s=???; Complete this line below
	    String s = String.valueOf(n);
	   //Write your code here
	   if (n == Integer.parseInt(s) && n >= -100 && n <= 100) {
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	  } catch (Exception e) {
	   System.out.println("Unsuccessful Termination!!");
	  }
	 }
}

