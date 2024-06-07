package org.gk.scopeclass;

import org.gk.scopeclass.adapters.JaqueiraAdapter;
import org.gk.scopeclass.adapters.MacieiraAdapter;
import org.gk.scopeclass.interfaces.ArvoreFrutifera;

public class Main {
    public static void main(String[] args) {

        ArvoreFrutifera arvoreFrutifera = new JaqueiraAdapter();
        arvoreFrutifera.darFrutos();

        arvoreFrutifera = new MacieiraAdapter();
        arvoreFrutifera.darFrutos();


    }
}