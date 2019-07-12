public class Main {
    public static void main(String[] args) {
        ControllerA controllerA = (ControllerA) Resources.INSTANCE.getClass("ControllerA");
        controllerA.print();
    }
}
