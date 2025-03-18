package org.clover.simple;

import org.clover.entity.DellMouse;
import org.clover.entity.HpMouse;
import org.clover.entity.Mouse;

public class MouseFactory {
    public static Mouse createMouse(int type) {
        return switch (type) {
            case 0 -> new DellMouse();
            case 1 -> new HpMouse();
            default -> new DellMouse();
        };
    }

    public static void main(String[] args) {
        Mouse mouse = createMouse(1);
        mouse.sayHi();
    }
}
