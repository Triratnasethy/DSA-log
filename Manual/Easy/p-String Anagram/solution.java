package A1;
import java.util.*;


public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str = sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2 = sc.nextLine();
		char[]a = str.toCharArray();
		char[]b=str.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
		

	}

}
