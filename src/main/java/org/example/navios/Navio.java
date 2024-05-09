package org.example.navios;

import org.example.enums.Bagagem;
import org.example.exceptions.IndefinedBoat;
import org.example.interfaces.Tarifa;

import java.text.DecimalFormat;

public class Navio {

    Tarifa tarifa;
    Double carga;


    public Navio(Bagagem bagagem,Double carga) throws IndefinedBoat {
        this.carga = carga;

        this.tarifa = switch (bagagem) {
            case Bagagem.Petroleo -> new Petroleiro();
            case Bagagem.Peixe -> new Pesqueiro();
            case Bagagem.Graos -> new Granoleiro();
            default -> throw new IndefinedBoat();
        };
    }

    public void pagarTarifas(){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");

        System.out.println("Valor a ser pago: " + df.format(tarifa.calcularTarifa(this.carga)));

    }

}
