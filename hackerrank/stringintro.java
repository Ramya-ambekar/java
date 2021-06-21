
import java.io.*;
import java.util.*;
public class stringintro {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter string:");
	        String str=sc.next();
	        System.out.print("Enter integr");
	        int b=sc.nextInt();
	        
	        /* Enter your code here. Print output to STDOUT. */
	        String max=str.substring(0,b);
	        String min=str.substring(0,b);
	        System.out.println(max);
	        System.out.print(min);
	    }
	}


