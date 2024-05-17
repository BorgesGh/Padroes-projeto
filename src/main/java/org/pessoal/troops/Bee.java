package org.pessoal.troops;

import org.pessoal.interfaces.Troop;

public class Bee implements Troop {
    @Override
    public void doAction() {
        System.out.println("Create a big bee house!");
    }
}
