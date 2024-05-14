package STRINGS;
import java.util.Scanner;
public class REVERSES_STRING2 
{
	public static String stringreversed(String str)
	{
		String reverse="";
		for(int i=0;i<str.length();i++)
		{
			reverse +=str.charAt(str.length()-i-1);
		}
		return reverse;
	}
	
	public static String reversed(String str)
	{
		String reverseTotal = stringreversed(str);
		String Entirereverse ="";
		int n =reverseTotal.length();
		for(int i=0;i<reverseTotal.length();i++)
		{
			Entirereverse+=str.charAt(n-i-1);
		}
		return Entirereverse;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reversed1 = stringreversed(str);
		System.out.println(reversed1);
		String reversed2 = reversed(str);
		System.out.print(reversed2);
		s.close();

	}

}
