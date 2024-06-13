package ambiente.objetos;

import ambiente.Objeto;

public class Relogio extends Objeto {

    public Relogio(String nome) {
        super(nome);
    }

    @Override
    public void printarNome(){
        System.out.println("Nome: " + this.nome);
    }

}
