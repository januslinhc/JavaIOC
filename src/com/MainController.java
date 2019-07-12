package com;

public class MainController extends Controller {
    void executeName() {
        Controller bestEmployeeController = this.getResources().getController("ControllerA");
        bestEmployeeController.run();
    }

    void executeBestEmpolyee() {
        Controller bestEmployeeController = this.getResources().getController("BestEmployeeController");
        bestEmployeeController.run();
    }

    @Override
    protected void run() {
        executeName();
        executeBestEmpolyee();
    }
}
