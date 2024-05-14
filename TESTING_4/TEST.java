package TESTING_4;

public class TEST 
{
	public String name;
	private int roll_number;
	
	public TEST(String name ,int roll_number)
	{
		this.name=name;
		this.roll_number=roll_number;
	}
	public TEST(String name)
	{
		this.name=name;
		this.roll_number=123;
	}
	public TEST()
	{
		this.name="ram";
		this.roll_number=123;
	}
	public void print()
	{
		System.out.println(name+" "+roll_number);
	}
	
	public int getroll_number()
	{
		return roll_number;
	}
	public void setroll_number(int roll_number)
	{
		if(roll_number<=0)
		{
			return;
		}
		this.roll_number=roll_number;
	}
	
	

}
