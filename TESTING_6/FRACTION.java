package TESTING_6;

public class FRACTION {
	
	private int numerator;
	private int denominator;
	
	public FRACTION(int numerator,int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
	}
	
	public void simplify()
	{
		int gcd=1;
		int smaller = Math.min(numerator,denominator);
		for(int i=2;i<=smaller;i++)
		{
			if(numerator%i==0 && denominator%i==0)
			{
				gcd=i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void print()
	{
		System.out.println(numerator+"/"+denominator);
	}
	
	public void increment()
	{
		numerator = numerator+denominator;
		simplify();
	}
	
//	public void add(FRACTION f2)
//	{
//		this.numerator = this.numerator * f2.denominator + this . denominator * f2.numerator;
//		this.denominator = this.denominator * f2.denominator;
//	}
	
	public static FRACTION add(FRACTION f1 , FRACTION f2)
	{
		int newnum = f1.numerator * f2.denominator + f1 . denominator * f2.numerator;
		int newdeno = f1.denominator * f2.denominator;
		FRACTION f3 = new FRACTION(newnum,newdeno);
		return f3;
	}
	

}
