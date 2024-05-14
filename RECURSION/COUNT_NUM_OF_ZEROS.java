package RECURSION;
import java.util.Scanner;
public class COUNT_NUM_OF_ZEROS 
{
	public static int CountOfZeros(int n)
	{
		if(n<10)
		{
			if(n==0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		if(n%10==0)
		{
			return 1+CountOfZeros(n/10);
		}
		else
		{
			return CountOfZeros(n/10);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CountOfZeros(n));
		s.close();
	}

}
