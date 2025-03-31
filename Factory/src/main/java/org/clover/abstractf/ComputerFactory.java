package org.clover.abstractf;

import org.clover.entity.Keyboard;
import org.clover.entity.Mouse;

abstract class ComputerFactory {
    public abstract Mouse createMouse();
    public abstract Keyboard createKeyboard();
}
