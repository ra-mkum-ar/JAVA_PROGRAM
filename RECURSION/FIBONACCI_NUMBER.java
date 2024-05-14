package RECURSION;
import java.util.Scanner;
public class FIBONACCI_NUMBER 
{
	public static int fibonacci (int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(fibonacci(n));
		s.close();
		
	}

}
