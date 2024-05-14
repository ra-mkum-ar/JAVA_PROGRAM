package patterns;
import java.util.Scanner;

public class PATTERN_9 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int i=n;
		 while(i>=1)
		 {
			 int j=n;
			 while(j>=i)
			 {
				 System.out.print(j + " ");
				 j=j-1;
		 }
		 System.out.println();
		 i=i-1;
	}
		 s.close();

}
}
/*	6 
	6 5 
	6 5 4 
	6 5 4 3 
	6 5 4 3 2 
	6 5 4 3 2 1 
*/
