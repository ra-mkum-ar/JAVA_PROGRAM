package STRINGS;
import java.util.Scanner;
public class INTRODUCTION_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		str=s.next();
		String str1;
		str1=s.nextLine();
		System.out.print(str+" "+str.length());
		System.out.println(str1+" "+str1.length());
		s.close();
	}

}
