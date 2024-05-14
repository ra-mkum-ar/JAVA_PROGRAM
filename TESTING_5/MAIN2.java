package TESTING_5;

import TESTING_4.TEST;

public class MAIN2 {
	
	public static void main(String[]args)
	{
		TEST t1 = new TEST("Monisha",50);
		TEST t2 = new TEST("Monisha");
		TEST t3 = new TEST();
		
		t1.print();
		t2.print();
		t3.print();
		
		
	}

}
