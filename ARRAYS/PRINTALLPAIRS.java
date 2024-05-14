package ARRAYS;

public class PRINTALLPAIRS {
	public static void printallpairs(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,4,5,6,7,8};
		printallpairs(arr);

	}

}
