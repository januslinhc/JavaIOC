import java.util.HashMap;
import java.util.Map;

public enum Controllers {
    INSTANCE;

    private Map<String, Controller> controllerMap = new HashMap<>();
    private Map<String, Service> serviceMap = new HashMap<String, Service>() {{
        put("NameService", new NameServiceB());
    }};

    Controllers() {
        this.controllerMap.put("ControllerA", new ControllerA());
    }

    public Object getClass(String name) {
        return controllerMap.get(name).getContoller(serviceMap);
    }
}
