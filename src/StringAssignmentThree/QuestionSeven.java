package StringAssignmentThree;

public class QuestionSeven {
    public static void main(String[] args) {
        // Write a program to find if a string contains all unique
        // character

        // assuming that string only contains english letters and spaces 
        // multiple string does not means not unique
        String string = "String";

        boolean unique = true;

        int[] letterCount = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char character = Character.isAlphabetic(string.charAt(i)) ?
             Character.toLowerCase(string.charAt(i)) : string.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterCount[index]++;
        }

        for (int count : letterCount) {
            if(count > 1) {
                unique = false;
                break;
            }
        }
        
        if(unique)
            System.out.println("\"" + string +"\" contains all unique characters");
        else
            System.out.println("\"" + string +"\" does not contain all unique characters");
    }
        
}   
