package RECURSION;
import java.util.Scanner;
public class SUM_N_NUMBERS {
	
	public static int SUM(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n+SUM(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(SUM(n));
		s.close();
	}

}
