package RECURSION;
import java.util.Scanner;
public class X_TO_POWER_N 
{
	public static int power(int n,int x)
	{
		if(x==0)
		{
			return 1;
		}
		else
		{
			return n*power(n,--x);
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		System.out.println(power(n,x));
		s.close();
	}

}
