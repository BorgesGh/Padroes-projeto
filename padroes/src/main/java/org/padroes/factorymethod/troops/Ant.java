package org.padroes.factorymethod.troops;

import org.padroes.factorymethod.interfaces.Troop;

public class Ant implements Troop {
    @Override
    public void doAction() {
        System.out.println("Create an big anthill!");
    }
}
