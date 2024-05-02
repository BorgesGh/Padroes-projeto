package org.padroes.factorymethod.factorys;

import org.padroes.factorymethod.troops.Ant;
import org.padroes.factorymethod.troops.Troop;

public class AntFactory implements TroopFactory{

    @Override
    public Troop createTroop() {
        return new Ant();
    }
}
