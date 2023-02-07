package StringAssignmentThree;

public class QuestionThree {
    public static void main(String[] args) {
        // Write a program to check if "2552" is a palndrome or not

        String string = "2552";
        boolean isPalindrome = true;
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if(string.charAt(i) != string.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }   
        }

        if(isPalindrome)
            System.out.println("\"" + string + "\" is a palindrome");
        else
            System.out.println("\"" + string + "\" is not a palindrome");
    }
}