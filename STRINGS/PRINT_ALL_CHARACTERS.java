package STRINGS;
import java.util.Scanner;
public class PRINT_ALL_CHARACTERS {
	public static void printAllCharacters(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.next();
		printAllCharacters(str);
		s.close();
		

	}

}
