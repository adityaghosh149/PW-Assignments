package StringAssignmentThree;

public class QuestionTwo {
    public static void main(String[] args) {
        // Write a program to print duplicate characters form string

        String string = "Hello, World! Java Programming.";

        int[] letterCount = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char character = Character.isAlphabetic(string.charAt(i)) ?
             Character.toLowerCase(string.charAt(i)) : string.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCount[index]++;
        }

        char character;
        for(int i = 0; i < letterCount.length; i++){
            if(letterCount[i] > 1) {
                character = (char) ('a' + i);
                System.out.println("'"+ character + "' appeared " + letterCount[i] + " times");
            }
                
        }
    }
}
