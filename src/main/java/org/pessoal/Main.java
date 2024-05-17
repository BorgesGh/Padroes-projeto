package org.pessoal;

import org.pessoal.factorys.AntFactory;
import org.pessoal.interfaces.Troop;

public class Main {
    public static void main(String[] args) {

        AntFactory factory = new AntFactory();

        Troop ant = factory.createTroop();

        ant.doAction();



    }
}