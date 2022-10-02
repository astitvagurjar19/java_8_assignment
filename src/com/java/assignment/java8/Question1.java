package com.java.assignment.java8;

@FunctionalInterface
interface operation1 {
    boolean compare(int a, int b);
}

@FunctionalInterface
interface operation2 {
    int incrementValue(int a);
}

@FunctionalInterface
interface operation3 {
    String concatinateTwoStrings(String string1, String string2);
}

@FunctionalInterface
interface operation4 {
    String convertStringToUpperCase(String string);
}

public class Question1 {
    public static void main(String[] args) {
        operation1 operation1 = (int a, int b) -> {
            return a > b;
        };
        System.out.println(operation1.compare(8, 5));

        operation2 operation2 = a -> ++a;
        System.out.println(operation2.incrementValue(5));

        operation3 operation3 = (a, b) -> a + b;
        System.out.println(operation3.concatinateTwoStrings("Hello", "World"));

        operation4 operation4 = a -> a.toUpperCase();
        System.out.println(operation4.convertStringToUpperCase("hello world"));
    }
}