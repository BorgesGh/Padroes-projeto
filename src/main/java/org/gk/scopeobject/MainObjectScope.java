package org.gk.scopeobject;

import org.gk.scopeobject.adapter.AdaptadorVGAparaHDMI;
import org.gk.scopeobject.cabos.CaboVGA;
import org.gk.scopeobject.client.Monitor;

public class MainObjectScope {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();

        CaboVGA caboVGA = new CaboVGA();
        AdaptadorVGAparaHDMI adaptador = new AdaptadorVGAparaHDMI(caboVGA);

        monitor.encaixarCaboHDMI(adaptador);
        monitor.darVideo();
    }
}
