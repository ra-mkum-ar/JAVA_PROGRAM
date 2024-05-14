package patterns;
import java.util.Scanner;

public class PATTERN_17 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int i=n;
		 while(i>=1)
		 {
			 int j=n;
            char ch=(char)('A'+n-1);
			 while(j>=i)
			 {
				 System.out.print(ch);
                 ch--;
				 j=j-1;
		 }
		 System.out.println();
		 i=i-1;
	}
		 s.close();
}
}



/*		E
		ED
		EDC
		EDCB
		EDCBA

*/
