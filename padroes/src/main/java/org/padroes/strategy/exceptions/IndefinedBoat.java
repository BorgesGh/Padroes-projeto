package org.padroes.strategy.exceptions;

public class IndefinedBoat extends Exception{

    @Override
    public String getMessage() {
        return "O Barco Selecionado não existe!!";
    }
}
