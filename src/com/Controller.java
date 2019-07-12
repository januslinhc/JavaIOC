package com;

public abstract class Controller {
    private Resources resources;

    Controller setResource(Resources resources) {
        this.resources = resources;
        return this;
    }

    protected Resources getResources() {
        return this.resources;
    }

    protected abstract void run();
}
