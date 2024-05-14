package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE9 {
	public static void main(String[]args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			int j=1;
			sum=sum+i;
			while(j<=i)
			{
				System.out.print(j);
				if(j==i)
				{
					System.out.print("=");
				}
				else
				{
					System.out.print("+");
				}
				j=j+1;
			}
				System.out.print(sum);
			    System.out.println();
			    i=i+1;
		}
		s.close();
	}
}	           



/*  1=1
	1+2=3
	1+2+3=6
	1+2+3+4=10
	1+2+3+4+5=15
*/
