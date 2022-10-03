package com.java.assignment.java8;

//Functional interface to perform different operation with single interface
@FunctionalInterface
interface Operation {
    int operation(int number1, int number2);
}

public class Question2 {

    //Static method to return product of two numbers
    static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    // non-static method  to return sum of two numbers
    int add(int number1, int number2) {
        return number1 + number2;
    }
    // non-static method  to return difference of two numbers
    int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2(); //creating object of  a class

        Operation operation = question2::add; //referencing non-static method
        System.out.println(operation.operation(50, 20)); //printing sum of two numbers

        operation = question2::subtract; //referencing non-static method
        System.out.println(operation.operation(500, 200)); //printing difference of two numbers

        operation = Question2::multiplication; //referencing static method
        System.out.println(operation.operation(10, 20)); //printing product of two numbers
    }
}
