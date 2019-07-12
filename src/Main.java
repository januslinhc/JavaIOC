public class Main {
    public static void main(String[] args) {
        ControllerA controllerA = (ControllerA) Controllers.INSTANCE.getClass("ControllerA");
        controllerA.print();
    }
}
