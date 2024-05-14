package patterns;
import java.util.Scanner;

public class PATTERN_4 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rows=1;
		while(rows<=number) {
			int cols = 1; 
			//System.out.println(" ");
			while(cols<=number) {
			 System.out.print(number-cols+1);
			 cols++;
			}
			System.out.println(); 
			rows++;
		}
		s.close();
	}

}
/*	4321
	4321
	4321
	4321
*/
