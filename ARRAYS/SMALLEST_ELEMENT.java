package ARRAYS;
import java.util.Scanner;

public class SMALLEST_ELEMENT {

	public static int minimum_element(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static int[] takeinput()
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        s.close();
        return arr;
    }
    public static void main(String[]args)
    {
        int arr[]=takeinput();
        int small=minimum_element(arr);
        System.out.print(small);
    }
}
     
