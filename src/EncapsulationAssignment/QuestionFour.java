package EncapsulationAssignment;

// What is the use of the ‘this’ keyword? Explain with an example.
// Answer:
// The "this" keyword in Java refers to the current instance of the class.
// It can be used to refer to the members (fields and methods) of the current
// object from within the object's own instance methods.

// For example, consider the following class definition:
class ExampleOne {
    int x;

    // The 'this' keyword can be used to refer to the current object from
    // within a constructor
    ExampleOne(int x) {
        this.x = x;
    }

    // The setX method takes an int parameter named x, which could potentially
    // conflict with the instance variable x. By using the 'this' keyword,
    // we can explicitly refer to the instance variable x, rather than the method
    // parameter. The getX method simply returns the value of the instance variable x.
    void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

public class QuestionFour {
    public static void main(String[] args) {
        ExampleOne exampleOne = new ExampleOne(0);
        exampleOne.setX(10);
        System.out.println(exampleOne.getX()); // outputs 10
    }
}
