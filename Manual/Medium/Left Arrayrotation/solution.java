package Arrays;

public class Arrayrotation {
	static void Rotate(int[]arr,int d)
	{
		int n=arr.length;
		for(int i=0;i<d;i++)
		{
			int first=arr[0];
			for(int j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[n-1]=first;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= { 12,3,4,5,6};
		Rotate(arr,2);
		

	}

}
