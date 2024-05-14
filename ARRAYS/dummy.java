package ARRAYS;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dummy 
{
	public static void main(String[] args) {
        // Input string
        String text = "The price of the product is $50.99";

        // Define the regular expression pattern to match digits
        Pattern pattern = Pattern.compile("\\d");

        // Create a Matcher object to find matches in the text
        Matcher matcher = pattern.matcher(text);

        // Iterate through the matches and print each digit found
        System.out.print("Digits found: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
	
	
}
