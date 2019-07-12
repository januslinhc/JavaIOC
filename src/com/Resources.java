package com;

import com.Controller;
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
    private Map<String, Service> serviceMap = new HashMap<String, Service>() {{
        put("com.Name.NameService", new NameServiceB());
        put("com.Employee.com.Employee.BestManagerService", new BestManagerService());
        put("com.Employee.com.Employee.BestOfficerService", new BestOfficerService());
    }};

    Resources() {
        this.controllerMap.put("com.Name.ControllerA", new ControllerA());
        this.controllerMap.put("com.Employee.com.Employee.BestEmployeeController", new BestEmployeeController());
    }

    public Object getClass(String name) {
        return controllerMap.get(name).getContoller(serviceMap, controllerMap);
    }
}
