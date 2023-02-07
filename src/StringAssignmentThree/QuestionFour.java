package StringAssignmentThree;

public class QuestionFour {
    public static void main(String[] args) {
        // Write a program to count the number of consonants, vowel, special character
        // in a string
        
        // space does not considered as special character
        String string = "Hello, World! Java Programming.";
        int consonant = 0;
        int vowel = 0;
        int specialCharacter = 0;
        char character;
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if(Character.isAlphabetic(character)) {
                if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                    vowel++;
                else
                    consonant++;
            } else if (!Character.isDigit(character) && character != ' ')
                specialCharacter++;
        }

        System.out.println("Consonants : " + consonant);
        System.out.println("Vowels : " + vowel);
        System.out.println("Special Character : " + specialCharacter);
    }
}
