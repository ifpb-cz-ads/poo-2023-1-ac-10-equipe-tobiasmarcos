public class registraAluno {
    private String nome;
    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String endereco;
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private int idade;
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private double notaMatematica;
    
    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    private double notaPortugues;

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    private double notaGeografia;

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }
    
    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }

    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }
    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: " + nome);
        System.out.println("Nota Matemática: "+ mNota);
        System.out.println("Nota Português: "+ pNota);
        System.out.println("Nota Geografia: "+ gNota);
    }
}
