package org.padroes.factorymethod.troops;

import org.padroes.factorymethod.interfaces.Troop;

public class Warm implements Troop {
    @Override
    public void doAction() {
        System.out.println("Drag surface and make Fetilize!");
    }
}
