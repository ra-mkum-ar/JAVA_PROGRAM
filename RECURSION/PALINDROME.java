package RECURSION;
import java.util.Scanner;
public class PALINDROME 
{
	public static boolean isPalindrome(String str , int left , int right)
	{
		if(left>=right)
		{
			return true;
		}
		else if(str.charAt(left)!=str.charAt(right))
		{
			return false;
		}
		return isPalindrome(str,left+1,right-1);
	}
	public static boolean isPalindrome(String str)
	{
		int left = 0;
		int right = str.length()-1;
		return isPalindrome(str,left,right);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isPalindrome(str));
		s.close();
		
	}

}
