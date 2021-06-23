import java.io.*;
import java.util.*; 
	public class reversestring {

	    public static String reverseword(String A) {
	        
	        /* Enter your code here. Print output to STDOUT. */
	        String st="";
	        int n=A.length();
	        for(int i=n-1;i>=0;i--){
	        	st=st+A.charAt(i);
	        }
	        System.out.print(st);
	        return(st);     
	    }
	    public static void main(String arg[]){
	    	String A="lucky";
	    	reverseword(A);		
	    }
	}

	

