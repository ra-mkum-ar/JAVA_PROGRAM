package ARRAYS_2;
import java.util.*;

public class ARRAY_ROTATION {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		String dir=s.next();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int arr1[]=new int[n];
		if(dir.equals("LEFT"))
		{
			for(int i=0;i<n;i++)
			{
				arr1[(i-x+n)%n]=arr[i];
			}
		}
		else if(dir.equals("RIGHT"))
		{
			for(int i=0;i<n;i++)
			{
				arr1[(i+x)%n]=arr[i];
			}
			
		}
						
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		s.close();
	}
}
