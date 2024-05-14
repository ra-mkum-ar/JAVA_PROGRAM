package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE4 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=n;
		while(i>=1)
		{
			int p=i;
			int j=1;
			while(j<=n)
			{
				if(j>=3 && i>=3 )
				{
					System.out.print("5");
					
				}
				else
				{
					System.out.print(p);
				}
				p=p+1;
				j=j+1;
			}
			System.out.println();
			i=i-1;
		}
		s.close();
        
	}
}
    
/*  4555
	3455
	2345
	1234
*/
