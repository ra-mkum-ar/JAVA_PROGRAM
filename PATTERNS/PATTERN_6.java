package patterns;
import java.util.Scanner;

public class PATTERN_6 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rows=1;
		
		while(rows<=number) {
			int cols = 1; 
			while(cols<=rows) {
			 System.out.print(cols);
			 cols++;
			}
			System.out.println(); 
			rows++;
		}
		s.close();
	}

}
/*	1
	12
	123
	1234
	12345*/
