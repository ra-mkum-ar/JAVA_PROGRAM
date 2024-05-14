package patterns;
import java.util.Scanner;
public class PATTERN_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=1;
			while(spaces<=n-i)
			{
				System.out.print(" ");
				spaces=spaces+1;
			}
			int inc=1;
			int p_left=i;
			while(inc<=i)
			{
				System.out.print(p_left);
				p_left=p_left+1;
				inc=inc+1;
			}
			int dec=i-1;
			int p_right=p_left-2;
			while(dec>=1)
			{
				System.out.print(p_right);
				p_right=p_right-1;
				dec=dec-1;
			}
			System.out.println();
			i=i+1;
		}
		s.close();
	}

}

/* 			1
           232
          34543
         4567654
        567898765
*/
