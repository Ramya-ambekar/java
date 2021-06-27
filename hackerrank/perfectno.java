
public class perfectno {
	public static void main(String[] args) {
		int sum=0;
		int n=7;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}		
		}
		if(sum==n){
			System.out.print("Perfectno");
		}
		else{
			System.out.print("Not perfect no");
		}
}
}


