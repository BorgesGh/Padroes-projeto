package org.padroes.factorymethod.factorys;

import org.padroes.factorymethod.interfaces.TroopFactory;
import org.padroes.factorymethod.interfaces.Troop;
import org.padroes.factorymethod.troops.Warm;

public class WarmFacoty implements TroopFactory {
    @Override
    public Troop createTroop() {
        return new Warm();
    }
}
