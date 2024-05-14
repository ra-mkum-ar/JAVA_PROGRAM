package TESTING_2;

public class TEST {
	int a;
	int b;
	
	TEST()
	{
		this(10,20);
		System.out.println("one parameter");
	}
	TEST(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("two parameter");
	}

}
