package StringAssignmentFour;

public class QuestionTwo {
    public static void main(String[] args) {
        // Write a program to reverse a string

        String string = "PWSKILLS";
        StringBuilder reverseString = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }

        System.out.println("Original String : " + string);
        System.out.println("Reverse String: " + reverseString);
    }
}
