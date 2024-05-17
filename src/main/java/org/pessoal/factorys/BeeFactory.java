package org.pessoal.factorys;


import org.pessoal.interfaces.Troop;
import org.pessoal.interfaces.TroopFactory;
import org.pessoal.troops.Bee;

public class BeeFactory implements TroopFactory {
    @Override
    public Troop createTroop() {
        return new Bee();
    }
}
