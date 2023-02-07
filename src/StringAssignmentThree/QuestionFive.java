package StringAssignmentThree;

public class QuestionFive {
    public static void main(String[] args) {
        // Write a program to implement Anagram Checking with least
        // inbuilt methods being used.

        // only considered english letters
        String stringOne = "School Master";
        String stringTwo = "The Classroom";

        boolean anagram = true;

        int[] letterCountOne = new int[26];
        int[] letterCountTwo = new int[26];

        for (int i = 0; i < stringOne.length(); i++) {
            char character = Character.isAlphabetic(stringOne.charAt(i)) ?
                    Character.toLowerCase(stringOne.charAt(i)) : stringOne.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCountOne[index]++;
        }

        for (int i = 0; i < stringTwo.length(); i++) {
            char character = Character.isAlphabetic(stringTwo.charAt(i)) ?
                    Character.toLowerCase(stringTwo.charAt(i)) : stringTwo.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCountTwo[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (letterCountOne[i] != letterCountTwo[i]) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("\"" + stringOne + "\" and \"" + stringTwo + "\" are anagram of each other" );
        else
            System.out.println("\"" + stringOne + "\" and \"" + stringTwo + "\" are not anagram of each other" );

    }
}
