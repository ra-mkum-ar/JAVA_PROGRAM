package RECURSION;

public class PRINT_NUMBERS_1_TO_N 
{
	public static void PrintNumbersincrease(int n)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			PrintNumbersincrease(n-1);
			System.out.print(n+" ");
		}
	}
	public static void PrintNumbersdecrease(int n)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			System.out.print(n+" ");
			PrintNumbersdecrease(n-1);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintNumbersincrease(10);
		System.out.println();
		PrintNumbersdecrease(10);
		
	}

}
