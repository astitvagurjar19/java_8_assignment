package com.java.assignment.java8;

// Creating two interfaces with same method name
interface interface1{
    default void interfaceMethod(){
        System.out.println("Interface1 Method");
    }
}

interface interface2{
    default void interfaceMethod(){
        System.out.println("Interface2 Method");
    }
}

public class Question5 implements interface1,interface2 {
    //overriding method of  interface so that it will not create ambiguity
    @Override
    public void interfaceMethod(){
        System.out.println("Main class Method");
    }
    public static void main(String[] args) {
        Question5 question =new Question5();
        question.interfaceMethod();
    }
}