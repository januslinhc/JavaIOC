package com.Employee;

public class Manager extends Employee {

    Manager(String name, int value) {
        super(name, value);
    }

    @Override
    public String role() {
        return "Manager";
    }

}
