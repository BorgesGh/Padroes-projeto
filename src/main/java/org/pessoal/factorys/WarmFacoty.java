package org.pessoal.factorys;


import org.pessoal.interfaces.Troop;
import org.pessoal.interfaces.TroopFactory;
import org.pessoal.troops.Warm;

public class WarmFacoty implements TroopFactory {
    @Override
    public Troop createTroop() {
        return new Warm();
    }
}
