package A1;
import java.util.*;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s = sc.nextInt();
		int [] arr =new int[s];
		for(int i = 0;i<s;i++)
		{
			System.out.println("Enter the elements in array");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element to be searched");
		int e = sc.nextInt();
		int count=0;
		for(int j=0;j<s;j++)
		{
			if(arr[j]==e)
			{
				count++;
				
			}
			
		}
		if(count>0)
		{
			System.out.println("Elements found");
			
		}
		else
		{
			System.out.println("Elements are not found");
		}
		
		
	

	}

}
