package patterns;
import java.util.Scanner;

public class PATTERN_13 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				char jth = (char)('A'+i-1);
				System.out.print( jth + " ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		 s.close();
	}

}
}
/*		A 
		B B 
		C C C 
		D D D D 
		E E E E E 

*/
