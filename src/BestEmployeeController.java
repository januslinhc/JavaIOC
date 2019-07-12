class BestEmployeeController extends Controller {
    void print(BestEmpolyeeService bestEmpolyeeService) {
        Employee employee = bestEmpolyeeService.getResult();
        System.out.println(String.format("Best employee =  %s (%s)", employee.name(), employee.role()));
    }
}
