
public class toptwoinarray {
	public static void main(String arg[]) {
		
	
int arr[]= new int[]{11,89090,-9,4,6};
int max1=0;
int max2=0;

	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max1) {
			max2=max1;
			max1=arr[i];
		}
		else if(arr[i]>max2)
		{
			max2=arr[i];
		}
}
System.out.println(max1);

System.out.print(max2);
}
}