package org.clover.method;

import org.clover.entity.Mouse;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse mouse = hpMouseFactory.createMouse();
        mouse.sayHi();
    }
}
