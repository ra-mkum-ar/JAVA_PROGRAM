package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE8 {
	public static void main(String[]args)
	{
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1)
		{
			int spaces=i;
			while(spaces<=n-1)
			{
				System.out.print(" ");
				spaces=spaces+1;
			}
			int j=1;
			while(j<=n)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i-1;
		}

        s.close();
	}
}	           



/*  ****
 	 ****
      ****
       ****
*/
