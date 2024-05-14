package patterns;
import java.util.Scanner;

public class PATTERNS_PRACTICE7 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("*");
        int i=1;
        while(i<=n)
        {
        	System.out.print("*");
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j=j+1;
            }
            int dec=i-1;
            while(dec>=1)
            {
            	System.out.print(dec);
            	dec=dec-1;
            }
            System.out.print("*");
            System.out.println();
            i=i+1;
        }
        i=n-1;
        while(i>=1)
        {
        	System.out.print("*");
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j=j+1;
            }
            int dec=i-1;
            while(dec>=1)
            {
            	System.out.print(dec);
            	dec=dec-1;
            }
            System.out.print("*");
            System.out.println();
            i=i-1;
        }
        System.out.println("*");
        s.close();
	}
}	           



/*  *
 	*1*
 	*121*
 	*12321*
 	*121*
 	*1*
 	*
*/
