import java.io.*;
import java.util.*; 
	public class reversestring {

	    public static String reverseword(String str) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String st="";
	        int n=A.length();
	        System.out.print(n);
	        for(int i=n-1;i>=0;i--){
	        	st=st+temparray[i];
	        }
	        return(st);
	        
	        
	    }
	}

	

