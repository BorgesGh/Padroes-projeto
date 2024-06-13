package ambiente;

public class Objeto {

    protected String nome;

    public Objeto(String nome) {
        this.nome = nome;
    }

    public void printarNome(){
        System.out.println("Nome: " + nome);
    }
    public String getNome() {
        return nome;
    }

    public void adicionarObjeto(Objeto objeto){
        throw new UnsupportedOperationException("Operação não suportada!\n" + this.getNome() +"Não é uma pasta");
    }
    public void removerObjeto(String nome){
        throw new UnsupportedOperationException("Operação não suportada!\n" + this.getNome() +"Não é uma pasta");
    }
    public Objeto getObjeto(String nome){
        throw new UnsupportedOperationException("Operação não suportada!\n" + this.getNome() +"Não é uma pasta");
    }
}
