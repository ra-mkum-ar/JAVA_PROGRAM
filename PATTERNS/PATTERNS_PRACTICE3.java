package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE3 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=n;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((char)('A'+j-1));
				j++;
			}
			System.out.println();
			i--;
		}
		s.close();
	}

}

/*  ABCD
	ABC
	AB
	A

*/
