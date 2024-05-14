package STRINGS;
import java.util.Scanner;
import java.util.Arrays;
public class REMOVE_CONSECUTIVE_CHARACTERS 
{
	public static String ConsecutiveDuplicate(String str)
	{
		int n =str.length();
		char ch[]=str.toCharArray();
		int k=0;
		for(int i=0;i<n-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				ch[k++]=ch[i];
			}
		}
		ch[k++]=ch[n-1];
		return new String(Arrays.copyOfRange(ch,0,k));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String ans = ConsecutiveDuplicate(str);
		System.out.print(ans);
		s.close();
		
		

	}

}
