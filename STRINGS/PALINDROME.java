package STRINGS;
import java.util.Scanner;
public class PALINDROME {
	public static boolean isPalindrome(String str) 
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
		
	}


	public static void main(String[] args)  {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		boolean ans = isPalindrome(str);
		System.out.println(ans);
		sr.close();
	}

}
