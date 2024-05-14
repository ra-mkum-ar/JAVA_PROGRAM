package TESTING_7;

public class COMPLEX_NUMBER 
{
	private int real;
	private int imaginary;
	
	public COMPLEX_NUMBER(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public static COMPLEX_NUMBER add(COMPLEX_NUMBER C1 , COMPLEX_NUMBER C2)
	{
		int newreal=C1.real+C2.real;
		int newimaginary=C1.imaginary+C2.imaginary;
		COMPLEX_NUMBER C3 = new COMPLEX_NUMBER(newreal,newimaginary);
		return C3;
	}
	
	public static COMPLEX_NUMBER subtract(COMPLEX_NUMBER C1 , COMPLEX_NUMBER C2)
	{
		int newreal=C1.real-C2.real;
		int newimaginary=C1.imaginary-C2.imaginary;
		COMPLEX_NUMBER C3 = new COMPLEX_NUMBER(newreal,newimaginary);
		return C3;
	}
	
	public static COMPLEX_NUMBER multiply(COMPLEX_NUMBER C1,COMPLEX_NUMBER C2)
	{
		int newreal=C1.real*C2.real+C1.imaginary*C2.imaginary;
		int newimaginary=C1.real*C2.imaginary+C1.imaginary*C2.real;
		COMPLEX_NUMBER C3 = new COMPLEX_NUMBER(newreal,newimaginary);
		return C3;
	}
	
	public void print()
	{
		System.out.println(real+"+"+"i"+imaginary);
	}

	

}
