import java.util.*;
public class pattern5 {
	public static void main(String args[]){
	String s="PROGRAM";
		
		for(int k=1;k<=7;k++){
			for(int l=1;l<=7;l++){
				if(l<k)
					System.out.print(" ");
				else
					System.out.print(s.charAt(l-1));
			}
			System.out.print("\n");
		}
	}

}
