package A1;
import java.util.*;

public class Q16 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String dup="";
		for(char ch:str.toCharArray())
		{
			if(dup.indexOf(ch)==-1)
			{
				dup+=ch;
			}
		}
		System.out.println(dup);
	}

}
