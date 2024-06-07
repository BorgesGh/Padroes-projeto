package org.gk.scopeclass.adapters;

import org.gk.scopeclass.frutiferas.Macieira;
import org.gk.scopeclass.interfaces.ArvoreFrutifera;

public class MacieiraAdapter extends Macieira implements ArvoreFrutifera {

    @Override
    public void crescerEmAnos(int anos){
        super.crescerEmAnos(anos);
    }

    @Override
    public void darFrutos() {
        super.darMacas();
    }
}
