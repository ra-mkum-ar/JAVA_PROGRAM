package RECURSION;
import java.util.Scanner;
public class GEOMETIC_SERIES {
	
	public static double series(int k,int n)
	{
		if(n==k)
		{
			return Math.pow(0.5,n);
		}
		else
		{
			return Math.pow(0.5,n)+series(k,++n);
		}
	}
	
	public static double series(int k)
	{
		int n=0;
		return series(k,n);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.println(series(k));
		s.close();

	}

}
