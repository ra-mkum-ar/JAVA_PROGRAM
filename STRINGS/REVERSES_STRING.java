package STRINGS;
import java.util.Scanner;
public class REVERSES_STRING 
{
	public static String Palindrome (String str)
	{
		String reverse="";
		for(int i=0;i<str.length();i++)
		{
			reverse +=str.charAt(str.length()-i-1);
		}
		return reverse;
	}
	

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = Palindrome(str);
		boolean check =true;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==reverse.charAt(i))
			{
				check = true;
				
			}
			else
			{
				check=false;
				
			}
		}
		if(check)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
		
		
		
		
		s.close();

	}

}
