package org.clover.abstractf;

import org.clover.entity.DellKeyboard;
import org.clover.entity.DellMouse;
import org.clover.entity.Keyboard;
import org.clover.entity.Mouse;

public class DellComputerFactory extends ComputerFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
