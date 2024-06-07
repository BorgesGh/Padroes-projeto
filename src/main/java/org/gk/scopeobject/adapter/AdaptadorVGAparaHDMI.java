package org.gk.scopeobject.adapter;

import org.gk.scopeobject.cabos.CaboHDMI;
import org.gk.scopeobject.cabos.CaboVGA;

public class AdaptadorVGAparaHDMI extends CaboHDMI {

    private CaboVGA caboVGA;
    public AdaptadorVGAparaHDMI(CaboVGA caboVGA) {
        this.caboVGA = caboVGA;
    }

    @Override
    public void passarConteudoHDMI() {
        caboVGA.passarVideoVGA();
    }
}
