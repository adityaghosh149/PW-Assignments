package StringAssignmentTwo;

public class QuestionTwo {
    // How do you concatenate two strings in Java? Give an example.

    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World!";

        // Using the '+' operator;
        String concatenatedStringOne = firstString + secondString;
        System.out.println("Concatenated String One : " + concatenatedStringOne);

        // Using concat()
        String concatenatedStringTwo = firstString.concat(secondString);
        System.out.println("Concatenated String Two : " + concatenatedStringTwo);
    }
}
