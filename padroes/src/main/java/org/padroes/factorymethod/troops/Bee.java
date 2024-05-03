package org.padroes.factorymethod.troops;

import org.padroes.factorymethod.interfaces.Troop;

public class Bee implements Troop {
    @Override
    public void doAction() {
        System.out.println("Create a big bee house!");
    }
}
