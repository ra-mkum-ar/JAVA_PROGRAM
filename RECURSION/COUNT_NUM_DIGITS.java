package RECURSION;
import java.util.Scanner;
public class COUNT_NUM_DIGITS 
{
	public static int CountOfDigits(int n)
	{
		if(n<10)
		{
			return 1;
		}
		else
		{
			return 1+CountOfDigits(n/10);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CountOfDigits(n));
		s.close();
	}

}
