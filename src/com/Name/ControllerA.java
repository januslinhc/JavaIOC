package com.Name;

import com.Controller;
import com.Employee.BestEmployeeController;
import com.Employee.BestEmpolyeeService;

public class ControllerA extends Controller {
    public void print() {
        System.out.println(String.format("I am %s", ((NameService) this.services.get("com.Name.NameService")).name()));

        invokeBestEmployeeController();
    }

    void invokeBestEmployeeController() {
        BestEmployeeController bestEmployeeController = ((BestEmployeeController) this.controllers.get("com.Employee.com.Employee.BestEmployeeController"));
        BestEmpolyeeService bestManagerService = ((BestEmpolyeeService) this.services.get("com.Employee.com.Employee.BestManagerService"));
        BestEmpolyeeService bestOfficerService = ((BestEmpolyeeService) this.services.get("com.Employee.com.Employee.BestOfficerService"));

        bestEmployeeController.print(bestManagerService);
        bestEmployeeController.print(bestOfficerService);
    }
}
