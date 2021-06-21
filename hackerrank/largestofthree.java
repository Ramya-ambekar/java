import java.util.Scanner;

public class largestofthree{
		public static void main(String args[]){
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.print("ENter a");
			a=sc.nextInt();
			System.out.print("ENter b");
			b=sc.nextInt();
			System.out.print("ENter c");
			c=sc.nextInt();
			if(a>b){
				if(a>c){
					System.out.print("A is large");
				}
				else{
					System.out.print("C is large");	
					}
			}
			else{
					if(b>c)
					{
						System.out.print("B is large");
					}
			}
		}
	}
