package org.example;

// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println(employee.getSalary());
        
    }
    }
