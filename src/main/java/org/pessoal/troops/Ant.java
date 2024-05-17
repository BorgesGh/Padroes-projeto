package org.pessoal.troops;

import org.pessoal.interfaces.Troop;

public class Ant implements Troop {
    @Override
    public void doAction() {
        System.out.println("Create an big anthill!");
    }
}
