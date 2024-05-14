package fundamentals;
import java.util.Scanner;
public class forloop11 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i+1==j)
					{
						return;
					}
					System.out.print(j);
				}
				System.out.println();
			}
			s.close();
		}
	}
	}

