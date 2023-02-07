package StringAssignmentThree;

import java.util.Arrays;

class QuestionOne {
    public static void main(String[] args) {
        // Write a program to remove duplicate from a string.(Take any String example with
        // with duplicate s character)

        String string = "Hello, World! Java Programming.";

        int[] letterCount = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char character = Character.isAlphabetic(string.charAt(i)) ?
             Character.toLowerCase(string.charAt(i)) : string.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCount[index]++;
        }

        StringBuilder resultString = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            int index = string.charAt(i) - 97;
            if( 0 <= index && index <= 26){
                if(letterCount[index] == 1)
                    resultString.append(string.charAt(i));
            } else
                resultString.append(string.charAt(i));
        }

        System.out.println("String after removing all the duplicate characters : " + resultString);
    }
}