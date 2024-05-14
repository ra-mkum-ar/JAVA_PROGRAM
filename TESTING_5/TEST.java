package TESTING_5;

public class TEST 
{
	
	String name;
	private int roll_number;
	
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
