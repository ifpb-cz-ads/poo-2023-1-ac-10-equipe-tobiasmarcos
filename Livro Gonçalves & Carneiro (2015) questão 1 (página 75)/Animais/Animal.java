abstract public class Animal {
    private String nome;
    private double idade;
    private String comida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

public abstract void grunhido();

}
