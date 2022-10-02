package com.java.assignment.java8;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    long salary;
    String city;

    public Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class Question4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(
                x -> x % 2 == 0
        ).collect(Collectors.toList());
        System.out.println(evenNumbers);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Amit Singh Prajapati", 2000, "Mumbai"));
        employees.add(new Employee("karan Malhotra", 5000, "Banglore"));
        employees.add(new Employee("Arpan Gupta", 3000, "Delhi"));
        employees.add(new Employee("Anand kumar", 4000, "Delhi"));
        employees.add(new Employee("Alok Chauhan", 7000, "Delhi"));
        employees.add(new Employee("Kanika Jain", 2000, "Delhi"));
        employees.add(new Employee("Arpan Mishra", 2000, "Delhi"));
        List<String> uniqueNameList = new ArrayList<String>();
        List<Employee> filteredEmployees = employees.stream().filter(x -> {
            String[] name = x.fullName.split(" ");
            String uniqueName = name[0];
            if (x.city == "Delhi" && x.salary < 5000) {
                if (uniqueNameList.contains(uniqueName) == false) {
                    uniqueNameList.add(uniqueName);
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(filteredEmployees.toString());
    }
}