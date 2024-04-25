package org.padroes.strategy;


import org.padroes.strategy.enums.Bagagem;
import org.padroes.strategy.exceptions.IndefinedBoat;
import org.padroes.strategy.navios.Navio;
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

/*
* Para manutenções será necessário:
*   -> Adicionar nova opção no Switch-case no metodo "CalcularTarifa"
*   -> Adicionar novo indice na Enumeração "Navio"
*   -> Adicionar nova Classe no pacote "navios" e implementar a interface "Tarifa"
*
*   -> integrantes: Ghabriel Borges, Isabella, Thais , Pedro rezende
* */

public class Main {
    public static void main(String[] args) {
        try {
            Navio n1 = new Navio(Bagagem.indefined,15000.5);
            n1.pagarTarifas();

        } catch (IndefinedBoat e) {
            System.out.println(e.getMessage()); ;
        }
    }


}