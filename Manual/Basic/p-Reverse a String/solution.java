package A1;
import java.util.*;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name=sc.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev += name.charAt(i);
		}
		System.out.println(rev);

	}

}
