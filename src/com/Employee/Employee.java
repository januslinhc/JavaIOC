package com.Employee;

public abstract class Employee {
    private String name;
    private int value;

    abstract String role();

    Employee(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String name() {
        return this.name;
    }

    public int value() {
        return this.value;
    }
}
