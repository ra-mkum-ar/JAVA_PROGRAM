package patterns;
//import java.util.Scanner;

public class PATTERNS_PRACTICE2 {
	public static void main(String[]args)
	{
		for (int i = 4; i >= 1; i--) {
		      for (int j = 1; j <= 4; j++) {
		        if (j > i) {
		          System.out.print("*");
		        } else {
		          System.out.print(j);
		        }
		      }
		      for (int j = 4; j >= 1; j--) {
		        if (j > i) {
		          System.out.print("*");
		        } else {
		          System.out.print(j);
		        }
		      }
		      System.out.println();
		    }
		  }
		
		}
		



/*  12344321
	123**321
	12****21
	1******1
*/
