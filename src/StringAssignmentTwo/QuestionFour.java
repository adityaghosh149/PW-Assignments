package StringAssignmentTwo;

public class QuestionFour {
    // How do you compare two strings in Java? Give example.
    public static void main(String[] args) {
        // Answer: We can compare two strings in Java following ways
        // 1. Comparing the actual object in the memory using '==' operator

        String stringOne = "Hello";
        String stringTwo = "Hello";
        String stringThree = new String("Hello");

        System.out.println("stringOne and StringTwo is the same object in the memory : " + (stringOne == stringTwo));
        System.out.println("stringOne and StringThree is the same object in the memory : " + (stringOne == stringThree));

        // 2. Comparing the value using equals() method (case-sensitive)
        String stringFour = "World";
        System.out.println("stringOne and StringTwo has same value : " + (stringOne.equals(stringTwo)));
        System.out.println("stringOne and StringFour has same value : " + (stringOne.equals(stringFour)));

        // 2. Comparing the value using equalsIgnoreCase() method (not case-sensitive)
        String stringFive = "heLLo";
        System.out.println("stringOne and StringFive has same value (ignore case) : " + (stringOne.equalsIgnoreCase(stringFive)));

    }
}
