package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE5 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(65+i-1));
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		s.close();
	}

}

/*  A
	BB
	CCC
	DDDD
*/
