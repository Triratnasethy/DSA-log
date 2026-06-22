package A1;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
