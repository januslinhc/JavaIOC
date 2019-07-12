package com.Employee;

public class BestManagerService implements BestEmpolyeeService {
    @Override
    public Employee getResult() {
        return new Manager("Tom", 5);
    }
}
