package org.example;

public class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager");
    }

    public void addEmployee() {
        System.out.println("New employee");
    }
}
