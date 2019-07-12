import java.util.Map;

abstract class Controller {
    Map<String, Service> services;
    Map<String, Controller> controllers;

    Controller getContoller(Map<String, Service> services, Map<String, Controller> controllers) {
        this.services = services;
        this.controllers = controllers;
        return this;
    }
}
