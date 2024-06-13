package ambiente.Armazenador;

import ambiente.Objeto;

import java.util.ArrayList;

public class BonecaRussa extends Objeto {

    protected ArrayList<Objeto> objetos;

    public BonecaRussa(String nome) {
        super(nome);
        objetos = new ArrayList<>();
    }

    @Override
    public void printarNome() {
        System.out.println("Boneca: " + super.getNome() + "\nDentro dela há...");
        objetos.forEach(obj -> obj.printarNome());

    }

    public void adicionarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void removerObjeto(String nome) {

        for (Objeto objeto : objetos) {
            if (objeto.getNome().equals(nome)) {
                objetos.remove(objeto);
                return;
            }
        }
        throw new RuntimeException("Objeto Nao encontrado");
    }

    public Objeto getObjeto(String nome) {

        for (Objeto objeto : objetos) {
            if (objeto.getNome().equals(nome)) {
                return objeto;
            }
        }
        throw new RuntimeException("Objeto Nao encontrado");
    }
}
