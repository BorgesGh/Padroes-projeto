package ambiente.objetos;

import ambiente.Objeto;

public class Dado extends Objeto {

    public Dado(String nome) {
       super(nome);
    }

    @Override
    public void printarNome(){
        System.out.println("Nome: " + this.nome);
    }


}
