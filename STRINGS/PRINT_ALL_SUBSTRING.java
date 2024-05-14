package STRINGS;
import java.util.Scanner;


public class PRINT_ALL_SUBSTRING {
	public static void printSubstrings(String str) {
		//Your code goes here
		for(int len=1;len<=str.length();len++)
		{
			for(int start=0;start<=str.length()-len;start++)
			{
				int end=start+len-1;
				System.out.println(str.substring(start,end+1));
			}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr =  new Scanner(System.in);
		String str = sr.next();

		printSubstrings(str);
		sr.close();
		

	}

}
