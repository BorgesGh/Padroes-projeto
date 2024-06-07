package org.gk.scopeclass.adapters;

import org.gk.scopeclass.frutiferas.Jaqueira;
import org.gk.scopeclass.interfaces.ArvoreFrutifera;

public class JaqueiraAdapter extends Jaqueira implements ArvoreFrutifera {

    @Override
    public void crescerEmAnos(int anos) {
        super.crescerEmAnos(anos);
    }

    @Override
    public void darFrutos() {
        super.darJacas();
    }
}
