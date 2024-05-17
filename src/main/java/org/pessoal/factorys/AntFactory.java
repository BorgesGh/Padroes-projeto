package org.pessoal.factorys;


import org.pessoal.interfaces.Troop;
import org.pessoal.interfaces.TroopFactory;
import org.pessoal.troops.Ant;

public class AntFactory implements TroopFactory {

    @Override
    public Troop createTroop() {
        return new Ant();
    }
}
