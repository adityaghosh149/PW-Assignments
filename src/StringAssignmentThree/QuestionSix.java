package StringAssignmentThree;

public class QuestionSix {
    public static void main(String[] args) {
        // Write a program to implement Pangram Checking with least
        // inbuilt methods being used.
        
        String string = "The quick brown fox jumps over the lazy dog";
        boolean pangram = true;

        boolean[] letterPresent = new boolean[26];

        for (int i = 0; i < string.length(); i++) {
            char character = Character.isAlphabetic(string.charAt(i)) ?
             Character.toLowerCase(string.charAt(i)) : string.charAt(i);
            int index = character - 97;
            if(0 <= index && index <= 26)
                letterPresent[index] = true;
        }

        for (boolean present : letterPresent) {
            if(!present) {
                pangram = false;
                break;
            }
        }
        
        if(pangram)
            System.out.println("\"" + string +"\" is a pangram");
        else
            System.out.println("\"" + string +"\" is not a pangram");
    }
}