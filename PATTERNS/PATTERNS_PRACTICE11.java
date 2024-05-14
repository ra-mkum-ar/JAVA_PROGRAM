package patterns;
import java.util.Scanner;
public class PATTERNS_PRACTICE11 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int k=1;k<=n;k++)
		{
			int i=1;
			n = s.nextInt();
			while(i<=n)
			{
				int spaces=1;
				while(spaces<=n+i-n)
				{
					System.out.print(" ");
					spaces=spaces+1;
				}
				int star=n;
				while(star>=i)
				{
					System.out.print("*");
					star=star-1;
				}
				System.out.println();
				i=i+1;
			}
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
