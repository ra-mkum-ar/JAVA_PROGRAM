package patterns;
import java.util.Scanner;

public class PATTERN_16 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int i=1;
		 while(i<=n)
		 {
			 char ch = (char)('A'+n-i);
			 int j=1;
			 while(j<=i)
			 {
				 System.out.print((char)(ch+j-1));
				 j=j+1;
			 }
			 System.out.println();
			 i=i+1;
		 }
		 s.close();
	}
}



/*		E
		DE
		CDE
		BCDE
		ABCDE

*/
