package org.clover.abstractf;

import org.clover.entity.Mouse;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new DellComputerFactory();
        Mouse mouse = computerFactory.createMouse();
        mouse.sayHi();
    }
}
