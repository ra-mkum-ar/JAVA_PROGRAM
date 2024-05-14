package fundamentals;

public class SCOPE_OF_VARIABLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;
		int a=1;
		while(a<=10)
		{
			b=10;
			System.out.println(b);
			b++;
			a++;
			System.out.println(b);
		}
		System.out.println(a);
		
}
}



