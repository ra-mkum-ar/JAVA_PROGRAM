package BINARY_SEARCH;
import java.util.Scanner;
public class FIND_THE_SQUAREROOT {

	
		
		public static int sqrtN(long N) {
			
			// Corner case
		    if(N == 0)
		    {
		        return 0;
		    }
		    
		    // Take 'ans' variable to store the square root of given number 'N'
		    int ans = 1;

		    // Run loop while square of 'ans' is less than equal to 'N'
		    while(ans <= (N / ans))
		    {
		        // Increament 'ans' by 1
		        ans++;
		    }

		    // Return 'ans'-1
		    return (int)(ans - 1);

		}
		public static void main(String[] args)
	    {
	        Scanner sr = new Scanner(System.in);
	        long n = sr.nextLong();
	        int ans = sqrtN(n);
	        System.out.println(ans);
	        sr.close();
	    }

	}


