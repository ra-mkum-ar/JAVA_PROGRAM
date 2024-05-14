package TEST_1;
import java.util.Scanner;
public class NUMBER_STAR_PATTERN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=n;
			while(j>=1)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
				j--;
			}
			System.out.println();
			i++;
		}
		s.close();

	}

}

/*  5432*
	543*1
	54*21
	5*321
 	*4321
*/
