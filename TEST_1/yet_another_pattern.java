package TEST_1;
import java.util.Scanner;
public class yet_another_pattern {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int n =s.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(j>=i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			t--;

		}
		s.close();
		
}
}