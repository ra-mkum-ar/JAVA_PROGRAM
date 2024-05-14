package TESTING_8;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DYNAMIC d = new DYNAMIC();
		for(int i=1;i<100;i++)
		{
			d.add(100+i);
		}
		System.out.println(d.size());
		d.set(2,170);
		System.out.println(d.get(2));
		while(!d.isEmpty())
		{
			System.out.println(d.removeLast());
			System.out.println("size - "+d.size());
		}
		

	}



}
