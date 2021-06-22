
public class pattern4 {

	public static void main(String args[]){
		int num=5;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		for(int k=1;k<=num;k++){
			for(int l=num-1;l>=k;l--){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}	
	
}
