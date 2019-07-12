package com.Employee;

import com.Controller;

public class BestEmployeeController extends Controller {
    public void print(BestEmpolyeeService bestEmpolyeeService) {
        Employee employee = bestEmpolyeeService.getResult();
        System.out.println(String.format("Best employee =  %s (%s)", employee.name(), employee.role()));
    }
}
