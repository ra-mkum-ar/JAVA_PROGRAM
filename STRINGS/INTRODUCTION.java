package STRINGS;

public class INTRODUCTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char arr[]= {'c','o','d','e'};
		String str1="coding";
		String str2="ninjas";
		System.out.println(str1.charAt(2));
		System.out.println(str1);
		System.out.println(str1.concat(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.contains("ing"));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.substring(0,2));
		
		

			String a1 ="abcd";
			String b1="abcda";
			System.out.println(a1.compareTo(b1));
			
			String a="coding",b="ninjas";
			if(a.contains("ing"))
			{
			    a+=b;
			}
			else
			{
			    b+="ing";
			}
			System.out.print(b+a);
			}
	
		
		

}



