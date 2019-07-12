class ControllerA extends Controller {
    void print() {
        System.out.println(String.format("I am %s", ((NameService) this.services.get("NameService")).name()));
    }
}
