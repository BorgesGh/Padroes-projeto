package org.padroes.factorymethod;

import org.padroes.factorymethod.factorys.AntFactory;
import org.padroes.factorymethod.factorys.BeeFactory;
import org.padroes.factorymethod.interfaces.TroopFactory;
import org.padroes.factorymethod.interfaces.Troop;

public class Main {

    public static void main(String[] args){

        TroopFactory antFactory = new AntFactory();
        Troop ant = antFactory.createTroop();

        TroopFactory beeFactory = new BeeFactory();
        Troop bee = beeFactory.createTroop();

        ant.doAction();
        bee.doAction();

    }
}
