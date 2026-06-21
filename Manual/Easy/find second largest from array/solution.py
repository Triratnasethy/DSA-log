package A1;
import java.util.*;

public class Q17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
			
		}
		int max = arr[0];
		int smax = arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if (arr[j]>max)
			{
				smax=max;
				max=arr[j];
			}
			else if(arr[j]>smax && arr[j]!=max)
			{
				smax=arr[j];
			}
			
		}
		System.out.println("Second largest number is"+smax);
	}

}
