package Arrays;

public class Union_Of_Arrays {
	static void Union(int[]arr1,int[]arr2)
	{
		int n=arr1.length+arr2.length;
		int[]arr3=new int[n];
		n=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[n]=arr1[i];
			n++;
		}
		n=arr1.length;
		for(int i=0;i<arr2.length;i++)
		{
			arr3[n]=arr2[i];
			n++;
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(" "+arr3[i]);
		}
	}

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		Union(arr1,arr2);
		

	}

}
