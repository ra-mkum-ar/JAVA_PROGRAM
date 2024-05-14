package patterns;
import java.util.Scanner;

public class PATTERN_1 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rows=1;
		while(rows<=number) {
			int cols = 1; 
			while(cols<=number) {
			 System.out.print(rows);
			 cols++;
			}
			System.out.println(); 
			rows++;
		}
		s.close();
	}

}
/* 1111
   2222
   3333
   4444*/