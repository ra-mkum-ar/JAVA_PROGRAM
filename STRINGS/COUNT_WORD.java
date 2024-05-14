package STRINGS;
import java.util.Scanner;
public class COUNT_WORD {
	
	public static int totalwords(String str)
	{
		int count=0;
		if(str.length()==0)
		{
			return 0;
		}
		if(!str.isEmpty())
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' ')
				{
					//The current character is the last character in the string (i + 1 == str.length()).
					//The next character is a space (str.charAt(i + 1) == ' ').
					if(i+1==str.length() || str.charAt(i+1)==' ')
					{
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		if(str == null)
		{
			str=" ";
		}
		int count = totalwords(str);
		System.out.print(count);
		s.close();

	}

}
