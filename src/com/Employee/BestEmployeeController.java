package com.Employee;

import com.Controller;

public class BestEmployeeController extends Controller {
    private void print(BestEmpolyeeService bestEmpolyeeService) {
        Employee employee = bestEmpolyeeService.getResult();
        System.out.println(String.format("Best employee =  %s (%s)", employee.name(), employee.role()));
    }

    @Override
    protected void run() {
        BestEmpolyeeService bestManagerService = ((BestEmpolyeeService) this.getResources().getService("BestManagerService"));
        BestEmpolyeeService bestOfficerService = ((BestEmpolyeeService) this.getResources().getService("BestOfficerService"));

        print(bestManagerService);
        print(bestOfficerService);
    }
}
