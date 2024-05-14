package STRINGS;

public class INTRODUCTION_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="coding";
		for(int i=2;i<4;i++)
		{
		    System.out.print(a.substring(i));
		}
		String b="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(b.substring(i-2,i+1));
		}
	}

}
