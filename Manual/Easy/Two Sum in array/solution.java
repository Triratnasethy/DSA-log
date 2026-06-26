package Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		
		int target=5;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]+a[j] == target)
				{
					System.out.print(i);
				}
			}
		}

	}

}
