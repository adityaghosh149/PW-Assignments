package StringAssignmentFour;

public class QuestionThree {
    public static void main(String[] args) {
        // Write a program to reverse a sentence while preserving the position

        String sentence = "Think Twice";

        String[] words = sentence.split(" ");

        StringBuilder reverseSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseSentence.append(words[i].charAt(j));
            }
            if (i != words.length - 1)
                reverseSentence.append(' ');
        }

        System.out.println("Original Sentence : " + sentence);
        System.out.println("Reverse Sentence : " + reverseSentence);
    }
}
