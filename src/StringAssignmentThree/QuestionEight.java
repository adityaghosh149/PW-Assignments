package StringAssignmentThree;

public class QuestionEight {
    public static void main(String[] args) {
        // Write a program to find the maximum occuring character in a string

        
        // only english letters are counted as occuring character
        String string = "Hello, World! Java Programming. PWSkills.";

        int[] letterCount = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char character = Character.isAlphabetic(string.charAt(i)) ?
             Character.toLowerCase(string.charAt(i)) : string.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCount[index]++;
        }

        int maxIndex = 0;
        for (int i = 0; i < letterCount.length; i++) {
            if(letterCount[maxIndex] < letterCount[i])
                maxIndex = i;
        }

        char mostOccurringCharacter = (char) ('a' + maxIndex);
        
        System.out.println("Most occuring character in \"" + string + "\" is '" + mostOccurringCharacter + "'");
        System.out.println("Which occurred " + letterCount[maxIndex] + " times");
    }
}
