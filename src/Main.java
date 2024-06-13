import ambiente.Armazenador.BonecaRussa;
import ambiente.Objeto;
import ambiente.objetos.Chave;
import ambiente.objetos.Dado;

public class Main {
    public static void main(String[] args) {

        Objeto obj = new Chave("Chave de fenda");
        Objeto obj2 = new Dado("Pirêmide");

        obj.printarNome();
        obj2.printarNome();

        Objeto boneca = new BonecaRussa("Maria");
        Objeto boneca2 = new BonecaRussa("Fernanda");

        boneca.adicionarObjeto(obj);
        boneca.adicionarObjeto(obj2);

        boneca.printarNome();

        boneca2.adicionarObjeto(boneca);

        boneca2.printarNome();


    }
}