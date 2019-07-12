package com;

import com.Name.ControllerA;

public class Main {
    public static void main(String[] args) {
        ControllerA controllerA = (ControllerA) Resources.INSTANCE.getClass("com.Name.ControllerA");
        controllerA.print();
    }
}
