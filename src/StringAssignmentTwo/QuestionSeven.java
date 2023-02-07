package StringAssignmentTwo;

public class QuestionSeven {
    // Write a program to delete all consonants from the string “Hello, have a good day”
    public static void main(String[] args) {
        String text = "Hello, have a good day";

        StringBuilder stringBuilderText = new StringBuilder("");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // not(letter && not(vowel)) => not(consonant)
            if(!(Character.isAlphabetic(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')))
                stringBuilderText.append(ch);
        }
        System.out.println("After removing all the consonants from the text : " + stringBuilderText);
    }
}
