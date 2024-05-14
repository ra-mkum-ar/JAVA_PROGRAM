package patterns;


public class PATTERNS_PRACTICE6 {
	public static void main(String[]args)
	{
		 int n = 4; // Number of rows
	        int i = 1;

	        while (i <= n) {
	            int j = 1;
	            while(j<=i)
	            {
	            	if(i==1)
	            	{
	            		System.out.print(1);
	            	}
	            	else if(j==1 || j==i)
	            	{
	            		System.out.print(i-1);
	            	}
	            	else
	            	{
	            		System.out.print(0);
	            	}
	            	j=j+1;
	            }
	            System.out.println();
	            i=i+1;
	        }
	}
}
	           



/*  1
	11
	202
	3003
*/
