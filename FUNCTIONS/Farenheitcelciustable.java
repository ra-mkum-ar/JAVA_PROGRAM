package functions;
import java.util.Scanner;

public class Farenheitcelciustable {

	public static void printFahrenheitTable(int start, int end, int step) {
		
        for(int fahrenheight = start;fahrenheight <= end;fahrenheight += step){

            int celcius = (int)((5.0/9)*(fahrenheight-32));
            System.out.println(fahrenheight + "\t"+ celcius);

        }
		
	}	

public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int start = s.nextInt();
	int end = s.nextInt();
	int step = s.nextInt();
	printFahrenheitTable(start, end, step);
	s.close();

}

}
	
