package org.clover.method;

import org.clover.entity.HpMouse;
import org.clover.entity.Mouse;

public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
