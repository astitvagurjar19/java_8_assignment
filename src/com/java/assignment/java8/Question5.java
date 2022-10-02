package com.java.assignment.java8;

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
    @Override
    public void interfaceMethod(){
        System.out.println("Main class Method");
    }
    public static void main(String[] args) {
        Question5 question =new Question5();
        question.interfaceMethod();
    }
}