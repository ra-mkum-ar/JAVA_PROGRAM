package patterns;
import java.util.Scanner;

public class PATTERN_8 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int p=i;
			int j=1;
			while(j<=i)
			{
				System.out.print(p);
				p=p+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		s.close();
	}

}
/*	1
	23
	345
	4567
	56789*/
