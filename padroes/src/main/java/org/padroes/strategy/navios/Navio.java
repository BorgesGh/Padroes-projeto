package org.padroes.strategy.navios;
import org.padroes.strategy.enums.Bagagem;
import org.padroes.strategy.exceptions.IndefinedBoat;
import org.padroes.strategy.interfaces.Tarifa;


import java.text.DecimalFormat;

public class Navio {

    Tarifa tarifa;
    Double carga;


    public Navio(Bagagem bagagem, Double carga) throws IndefinedBoat {
        this.carga = carga;

        this.tarifa = switch (bagagem) {
            case Petroleo -> new Petroleiro();
            case Peixe -> new Pesqueiro();
            case Graos -> new Granoleiro();
            default -> throw new IndefinedBoat();
        };
    }

    public void pagarTarifas(){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");

        System.out.println("Valor a ser pago: " + df.format(tarifa.calcularTarifa(this.carga)));

    }

}
