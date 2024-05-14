package TESTING_7;

public class MAIN {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		COMPLEX_NUMBER C1 = new COMPLEX_NUMBER(1,3);
		COMPLEX_NUMBER C2 = new COMPLEX_NUMBER(3,4);
		COMPLEX_NUMBER C3 = COMPLEX_NUMBER.add(C1,C2);
		COMPLEX_NUMBER C4 = COMPLEX_NUMBER.subtract(C1,C2);
		COMPLEX_NUMBER C5 = COMPLEX_NUMBER.multiply(C1,C2);
		C3.print();
		C4.print();
		C5.print();
		
		

	}

}
