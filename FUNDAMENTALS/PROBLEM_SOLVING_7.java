package fundamentals;
import java.util.Scanner;

public class PROBLEM_SOLVING_7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int div=2;
		boolean isPrime =true;
		while(div<=n/2)
		{
			if(n%div==0)
			{
				isPrime = false;
			}
			div=div+1;
		}
		if(isPrime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Composite");
		}
		s.close();
		
	}

}
