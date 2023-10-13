import java.util.HashSet;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a HashSet to store the unique characters in the input
        HashSet<Character> characters = new HashSet<>();

        // Iterate through the input string and add each character to the HashSet
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }

        // Check if the HashSet contains all the letters from 'a' to 'z'
        return characters.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}





