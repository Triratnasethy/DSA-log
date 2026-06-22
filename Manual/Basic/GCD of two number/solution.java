package A1;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2 nd number");
		int b = sc.nextInt();
		while(b!=0)
		{
			int temp = b;
			b=a%b;
			a=temp;
		}
		System.out.println("Gcd = "+a);

	}

}
