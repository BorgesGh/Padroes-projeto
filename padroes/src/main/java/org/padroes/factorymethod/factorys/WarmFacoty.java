package org.padroes.factorymethod.factorys;

import org.padroes.factorymethod.troops.Troop;
import org.padroes.factorymethod.troops.Warm;

public class WarmFacoty implements TroopFactory{
    @Override
    public Troop createTroop() {
        return new Warm();
    }
}
