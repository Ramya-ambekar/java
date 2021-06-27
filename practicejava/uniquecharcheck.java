
public class uniquecharactercheck{
	public static void main(String[] args) {
		String s="abcdefghijklmnopppppqrstuvwxyz";
		int n=s.length();
		boolean a=true;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(i!=j && s.charAt(i)==s.charAt(j)){
					//System.out.println(i);
					//System.out.println(j);
					a=false;
					//System.out.println(a);
					break;
				}
				
			}
			
		
	}
		if(a==true){
			System.out.print(a);
		}
		else{
			System.out.print("false");
		}
		
	}

}
