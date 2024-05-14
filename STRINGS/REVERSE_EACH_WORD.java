package STRINGS;

public class REVERSE_EACH_WORD {
	
	public static String Reverse(String str)
	{
		String ans=" ";
		int currentwordStart=0;
		int n =str.length();
		int i=0;
		for(;i<n;i++)
		{
			if(str.charAt(i)==' ')
			{
				int currentwordEnd = i-1;
				String reverseword=" ";
				for(int j=currentwordStart;j<=currentwordEnd;j++)
				{
					reverseword = str.charAt(j)+reverseword;
				}
				ans+=reverseword+" ";
				currentwordStart=i+1;
			}
			
		}
		int currentwordEnd = i-1;
		String reverseword=" ";
		for(int j=currentwordStart;j<=currentwordEnd;j++)
		{
			reverseword = str.charAt(j)+reverseword;
		}
		ans+=reverseword;
		return ans;
	}
	public static void main(String[]args)
	{
		String str ="abc def ijk";
		String ans =Reverse(str);
		System.out.print(ans);
	}

}
