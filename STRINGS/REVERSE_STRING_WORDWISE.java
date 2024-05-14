package STRINGS;

public class REVERSE_STRING_WORDWISE {

    // Helper function to reverse a word
    public static String reverseWord(String word) {
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        return reverse;
    }

    // Function to reverse the string wordwise
    public static String finalReverse(String str) {
        String entireReversed = reverseWord(str);
        String ans = "";
        int currentWordStart = 0;
        int n = entireReversed.length();
        int i = 0;
        for (; i < n; i++) {
            if (entireReversed.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String word = entireReversed.substring(currentWordStart, currentWordEnd + 1);
                String reverseWord = reverseWord(word);
                ans += reverseWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String word = entireReversed.substring(currentWordStart, currentWordEnd + 1);
        String reverseWord = reverseWord(word);
        ans += reverseWord;
        return ans;
    }

    public static void main(String[] args) {
        String str = "Welcome To Coding Ninjas";
        
        // Reverse each word individually
        String result1 = reverseWord(str);
        System.out.println("Reversed individual words: " + result1);
        
        // Reverse the entire string wordwise
        String result2 = finalReverse(str);
        System.out.println("Reversed wordwise: " + result2);
    }
}
