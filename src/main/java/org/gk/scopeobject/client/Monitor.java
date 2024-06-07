package org.gk.scopeobject.client;

import org.gk.scopeobject.cabos.CaboHDMI;

public class Monitor {

    private CaboHDMI caboHDMI;

    public CaboHDMI getCaboHDMI() {
        return this.caboHDMI;
    }

    public void encaixarCaboHDMI(CaboHDMI caboHDMI){
        this.caboHDMI = caboHDMI;
    }

    public void darVideo(){
        this.caboHDMI.passarConteudoHDMI();
    }

}
