package org.example.exceptions;

public class IndefinedBoat extends Exception{

    @Override
    public String getMessage() {
        return "O Barco Selecionado não existe!!";
    }
}
