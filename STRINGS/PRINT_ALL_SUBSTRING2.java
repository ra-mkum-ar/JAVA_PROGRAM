package STRINGS;
import java.util.Scanner;


public class PRINT_ALL_SUBSTRING2 {
	public static void printSubstrings(String str) {
		//Your code goes here
		int n = str.length();
		for (int i = 0; i < n; i++) 
	           for (int j = i+1; j <= n; j++)
	            
	                System.out.println(str.substring(i, j));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr =  new Scanner(System.in);
		String str = sr.next();

		printSubstrings(str);
		sr.close();
		

	}

}
