package Arrays;

public class Remove_duplicate {

	public static void main(String[] args) {
		int[]arr= {1,2,2,3,4,5,6,6,5};
		for(int i=0;i<arr.length;i++)
		{
			boolean dup=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					dup=true;
					break;
				}
			}
			if(!dup) {
				System.out.print(" "+arr[i]);
			}
		}

	}

}
