import java.util.HashMap;
import java.util.Map;

public enum Resources {
    INSTANCE;

    private Map<String, Controller> controllerMap = new HashMap<>();
    private Map<String, Service> serviceMap = new HashMap<String, Service>() {{
        put("NameService", new NameServiceB());
        put("BestManagerService", new BestManagerService());
        put("BestOfficerService", new BestOfficerService());
    }};

    Resources() {
        this.controllerMap.put("ControllerA", new ControllerA());
        this.controllerMap.put("BestEmployeeController", new BestEmployeeController());
    }

    public Object getClass(String name) {
        return controllerMap.get(name).getContoller(serviceMap, controllerMap);
    }
}
