package org.example;

import org.example.enums.Bagagem;
import org.example.exceptions.IndefinedBoat;
import org.example.interfaces.Tarifa;
import org.example.navios.Granoleiro;
import org.example.navios.Navio;
import org.example.navios.Pesqueiro;
import org.example.navios.Petroleiro;
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

/*
* Para manutenções será necessário:
*   -> Adicionar nova opção no Switch-case no metodo "CalcularTarifa"
*   -> Adicionar novo indice na Enumeração "Navio"
*   -> Adicionar nova Classe no pacote "navios" e implementar a interface "Tarifa"
* */

public class Main {
    public static void main(String[] args) {


        try {
            Navio n1 = new Navio(Bagagem.Graos,15000.5);
            n1.pagarTarifas();

        } catch (IndefinedBoat e) {
            System.out.println(e.getMessage()); ;
        }
    }
}