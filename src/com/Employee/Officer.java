package com.Employee;

public class Officer extends Employee {
    Officer(String name, int value) {
        super(name, value);
    }

    @Override
    public String role() {
        return "Officer";
    }
}
