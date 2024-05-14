package patterns;
import java.util.Scanner;
public class PATTERN_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=1;
			while(spaces<=n-i)
			{
				System.out.print(" ");
				spaces=spaces+1;
			}
			int star=1;
			while(star<=i)
			{
				System.out.print(star);
				star=star+1;
			}
			System.out.println();
			i=i+1;
		}
		s.close();
	}

}

/* 		1
  	   12
 	  123
	 1234
*/
