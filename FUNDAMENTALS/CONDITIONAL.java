package fundamentals;
import java.util.Scanner;

public class CONDITIONAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a>b)
		{
			System.out.println("a is greater");
		}
		if(b>a)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("Both are equal");
		}
		s.close();
	}

}
