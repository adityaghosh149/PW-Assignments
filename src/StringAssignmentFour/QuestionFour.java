package StringAssignmentFour;

import java.util.Arrays;

public class QuestionFour {
    public static void main(String[] args) {
        // Write a program to sort a string alphabetically

        // case-sensitive
        String string = "Java Programming";

        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        System.out.println("Original String : " + string);
        System.out.println("Sorted String : " + sortedString);
    }
}
