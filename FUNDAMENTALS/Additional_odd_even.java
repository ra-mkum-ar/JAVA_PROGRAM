package fundamentals;
import java.util.Scanner;

public class Additional_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int rem = a%2;
		boolean result = rem ==0;
		if(result==true)
		{
			System.out.println(a + " is true");
		}
		else
		{
			System.out.println(a + " is odd");
		}
		s.close();

	}

}
