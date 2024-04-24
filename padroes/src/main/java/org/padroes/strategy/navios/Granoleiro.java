package org.padroes.strategy.navios;


import org.padroes.strategy.interfaces.Tarifa;

public class Granoleiro implements Tarifa {
    @Override
    public double calcularTarifa(double toneladas) {
        if(toneladas >= 5000){
            return toneladas * 0.4;
        }
        return toneladas * 0.014;
    }
}
