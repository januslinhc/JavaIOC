class ControllerA extends Controller {
    void print() {
        System.out.println(String.format("I am %s", ((NameService) this.services.get("NameService")).name()));

        invokeBestEmployeeController();
    }

    void invokeBestEmployeeController() {
        BestEmployeeController bestEmployeeController = ((BestEmployeeController) this.controllers.get("BestEmployeeController"));
        BestManagerService bestManagerService = ((BestManagerService) this.services.get("BestManagerService"));
        BestOfficerService bestOfficerService = ((BestOfficerService) this.services.get("BestOfficerService"));

        bestEmployeeController.print(bestManagerService);
        bestEmployeeController.print(bestOfficerService);
    }
}
