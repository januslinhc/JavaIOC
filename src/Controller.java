import java.util.Map;

abstract class Controller {
    Map<String, Service> services;

    Controller getContoller(Map<String, Service> services) {
        this.services = services;
        return this;
    }
}
