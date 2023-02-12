package EncapsulationAssignment;

// What are getter and setter methods in Java? Explain with an example.
// Answer:
// Getter and setter methods are used to control access to an object's fields.
// They are commonly used in object-oriented programming languages like Java
// to enforce encapsulation and information hiding.

class ExampleTwo {
    int x;

    // A setter method is used to modify the value of an object's field. It
    // is typically named setFieldName where FieldName is the name of the
    // field you want to modify. For example:

    void setX(int x) {
        this.x = x;
    }

    // A getter method is used to retrieve the value of an object's field.
    // It is typically named getFieldName where FieldName is the name of the
    // field you want to retrieve. For example:

    int getX() {
        return x;
    }
}

 // In this example, the getX method is used to retrieve the value of the x
 // field, and the setX method is used to modify the value of the x field.
 // By using getter and setter methods, you can control access to the fields
 // of an object and enforce encapsulation and information hiding.

public class QuestionThree {
    public static void main(String[] args) {
        // In this example, we create an instance of the Example class and use the
        // setX method to set the value of the x field to 10. We then use the getX
        // method to retrieve the value of the x field and print it to the console.
        ExampleTwo example = new ExampleTwo();
        example.setX(10);
        System.out.println(example.getX()); // outputs 10
    }
}
