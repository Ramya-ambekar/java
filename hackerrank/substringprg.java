
public class substringprg {

	public static void main(String[] args){
		String a="abc";
		int n=a.length();
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++)
			{
				System.out.println(a.substring(i,j));
			}
		}
		
	}
}
