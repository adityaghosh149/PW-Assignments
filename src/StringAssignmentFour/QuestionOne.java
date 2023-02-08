package StringAssignmentFour;

public class QuestionOne {
    public static void main(String[] args) {
        // What is Mutable String in Java? Explain with an example.

        // Answer: A mutable string in Java is a string that can be modified
        // after it has been created. In Java, the 'string' class is immutable,
        // meaning that once a 'String' object has created, its value cannot be changed
        // However, we can use 'StringBuilder' or 'StringBuffer' class to create
        // immutable object that can be changed.

        StringBuilder stringBuilderOne = new StringBuilder("Hello");
        StringBuilder stringBuilderTwo = stringBuilderOne;

        stringBuilderOne.append(" ");
        stringBuilderOne.append("World");

        System.out.println(stringBuilderOne);
        System.out.println(stringBuilderTwo);

        // in StringBuilder change happen on same object and as both stringBuilderOne and
        // stringBuilderTwo referring to the same object the change will reflect on both
        // object. But in case of 'String' we can't do that any change on String will result
        // to a new object

    }
}
