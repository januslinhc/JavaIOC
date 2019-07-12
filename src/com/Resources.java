package com;

import com.Employee.BestEmployeeController;
import com.Employee.BestManagerService;
import com.Employee.BestOfficerService;
import com.Name.ControllerA;
import com.Name.NameServiceB;

import java.util.HashMap;
import java.util.Map;

public enum Resources {
    INSTANCE;

    private Map<String, Controller> controllerMap = new HashMap<>();
    private Map<String, Service> serviceMap = new HashMap<>();

    void addController(Controller controller) {
        controllerMap.put(controller.getClass().getSimpleName(), controller);
    }

    void addService(Service service) {
        addService(service.getClass().getSimpleName(), service);
    }

    void addService(String key, Service service) {
        serviceMap.put(key, service);
    }

    Resources() {
        /// Service List ///
        addService("NameService", new NameServiceB());
        addService(new BestManagerService());
        addService(new BestOfficerService());

        /// Controller List ///
        addController(new MainController());
        addController(new ControllerA());
        addController(new BestEmployeeController());
    }

    public Controller getController(String name) {
        return controllerMap.get(name).setResource(this);
    }

    public Service getService(String name) {
        return serviceMap.get(name);
    }
}
