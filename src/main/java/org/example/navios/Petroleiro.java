package org.example.navios;

import org.example.interfaces.Tarifa;

public class Petroleiro implements Tarifa {
    @Override
    public double calcularTarifa(double litros) {
        if(litros < 20000){
            return litros * 1.05;
        }
        return litros * 1.10;
    }
}
