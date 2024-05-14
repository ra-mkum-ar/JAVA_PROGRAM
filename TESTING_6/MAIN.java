package TESTING_6;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FRACTION f1 = new FRACTION(4,6);
		FRACTION f2 = new FRACTION(4,8);
//		f1.add(f2);
//		f1.print();
		
		FRACTION f3 = FRACTION.add(f1,f2);
		f3.print();
		

	}

}
