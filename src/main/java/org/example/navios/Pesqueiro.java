package org.example.navios;

import org.example.interfaces.Tarifa;

public class Pesqueiro implements Tarifa {
    @Override
    public double calcularTarifa(double tonelada) {
        if(tonelada > 50000){
            return tonelada * 0.15;
        }
        return tonelada * 0.04;
    }
}
