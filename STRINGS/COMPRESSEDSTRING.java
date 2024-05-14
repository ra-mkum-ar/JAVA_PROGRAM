package STRINGS;
import java.util.Scanner;
public class COMPRESSEDSTRING {

	public static String compressedString(String str)
    {
        String compressed="";
        int n =str.length();
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                compressed=compressed+str.charAt(i-1);   
                if(count>1)
                {
                    compressed+=count;
                }
                count=1;
            }
        }
            compressed=compressed+str.charAt(n-1);
            if(count>1)
            {
                compressed+=count;
            }
        return compressed;
    }
	
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    String str = s.next();
	    String Compressed1 = compressedString(str);
		System.out.println("Compressed String : "+Compressed1);
		s.close();
	}
}

