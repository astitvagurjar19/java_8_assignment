package com.java.assignment.java8;

@FunctionalInterface
interface Operation {
    int operation(int number1, int number2);
}

public class Question2 {

    static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    int add(int number1, int number2) {
        return number1 + number2;
    }

    int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();

        Operation operation = question2::add;
        System.out.println(operation.operation(50, 20));

        operation = question2::subtract;
        System.out.println(operation.operation(500, 200));

        operation = Question2::multiplication;
        System.out.println(operation.operation(10, 20));
    }
}
