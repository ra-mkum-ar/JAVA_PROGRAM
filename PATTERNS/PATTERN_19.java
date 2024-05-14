package patterns;
import java.util.Scanner;

public class PATTERN_19 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int i=n;
		 while(i>=1)
		 {
			 int j=n;
       		 while(j>=n-i+1)
			 {
				 System.out.print(i);
				 j=j-1;
		 }
		 System.out.println();
		 i=i-1;
	}
	s.close();
}
}



/*		4444
		333
		22
		1

*/
