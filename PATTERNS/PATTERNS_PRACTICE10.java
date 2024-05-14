package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE10 {
	public static void main(String[]args)
	{
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i=1;
		while(i<=n)
		{
			int val=2*i-1;
			int j=n;
			while(j>0)
			{
				System.out.print(val);
				val=val+2;
				
				int max=(2*n)-1;
				if(val>max)
				{
					val=1;
				}
				j=j-1;
			}
			System.out.println();
			i=i+1;
		}
        s.close();
	}
}	           



/*  1357
	3571
	5713
	7135
*/
