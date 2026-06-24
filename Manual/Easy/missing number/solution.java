package Arrays;

public class Missing_number {

	public static void main(String[]args)
	{
		int arr[]= {1,2,3,4,6,7,8,9};
		int n=9;
		int sum = n*(n+1)/2;
		int arrsum=0;
		for(int i=0;i<arr.length;i++)
		{
			arrsum+=arr[i];
		}
		int miss = sum-arrsum;
		System.out.println(miss);

	}

}
