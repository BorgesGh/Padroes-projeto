package org.padroes.factorymethod.factorys;

import org.padroes.factorymethod.interfaces.TroopFactory;
import org.padroes.factorymethod.troops.Bee;
import org.padroes.factorymethod.interfaces.Troop;

public class BeeFactory implements TroopFactory {
    @Override
    public Troop createTroop() {
        return new Bee();
    }
}
