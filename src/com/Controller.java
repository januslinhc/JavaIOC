package com;

import java.util.Map;

public abstract class Controller {
    protected Map<String, Service> services;
    protected Map<String, Controller> controllers;

    Controller getContoller(Map<String, Service> services, Map<String, Controller> controllers) {
        this.services = services;
        this.controllers = controllers;
        return this;
    }
}
