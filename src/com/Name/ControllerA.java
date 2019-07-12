package com.Name;

import com.Controller;

public class ControllerA extends Controller {
    public void print() {
        System.out.println(String.format("I am %s", ((NameService) this.getResources().getService("NameService")).name()));
    }

    @Override
    protected void run() {
        print();
    }
}
