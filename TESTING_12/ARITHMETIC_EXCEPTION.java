package TESTING_12;
public class ARITHMETIC_EXCEPTION 
{
	public static int divide(int a,int b)throws DivideByZeroException
	{
		if(b==0)
		{
			throw new DivideByZeroException();
		}
		return a/b;
	}

	public static void main(String[] args) throws DivideByZeroException 
	{
		try
		{
			divide(10,0);
		}
		catch(DivideByZeroException e)
		{
			System.out.println("Divide by zero Exception is Raised");
		}
		finally
		{
			System.out.println("hello");
		}

		System.out.println("Main");
	

	}

}
