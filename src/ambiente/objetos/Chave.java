package ambiente.objetos;

import ambiente.Objeto;

public class Chave extends Objeto {

    public Chave(String nomeDoObjeto){
        super(nomeDoObjeto);
    }

    @Override
    public void printarNome(){
        System.out.println("Nome: " + this.nome);
    }

}
