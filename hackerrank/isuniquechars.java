
public class isuniquechars {
	String str;
	isuniquechars(String str){
		this.str=str;
	}
	boolean isuniquechars(String str){
		if(str.length()>128)
			return false;
		boolean[] char_array=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(char_array[val]){
				System.out.print("false");
				return false;
			}
			char_array[val]=true; 
		}
		System.out.print("true");
		 return true; 
		 
	}
	

public static void main(String arg[]){
	String str="ramya";
	isuniquechars is=new isuniquechars(str);
	is.isuniquechars(str);
}
}