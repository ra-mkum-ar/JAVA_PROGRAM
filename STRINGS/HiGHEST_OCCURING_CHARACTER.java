package STRINGS;

public class HiGHEST_OCCURING_CHARACTER {
	public static char HighestOccurence(String str)
	{
		int n =str.length();
		int frequency[]=new int[256];
		int maxfrequency=0;
		for(int i=0;i<n;i++)
		{
			frequency[str.charAt(i)]++;
			maxfrequency=Math.max(maxfrequency,frequency[str.charAt(i)]);
		}
		char answer ='\0';
		for(int i=0;i<n;i++)
		{
			if(frequency[str.charAt(i)]==maxfrequency)
			{
				answer=str.charAt(i);
				System.out.println(i);
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdeapapqarr";
		char ch =HighestOccurence(str);
		System.out.print(ch);
		
		
		

	}

}
