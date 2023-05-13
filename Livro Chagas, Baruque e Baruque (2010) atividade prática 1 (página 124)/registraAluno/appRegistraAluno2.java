public class appRegistraAluno2 {
    public static void main(String[] args) {
        registraAluno novoAluno = new registraAluno();

        novoAluno.setNome("Tobias");
        novoAluno.setEndereco("Av. Central, 220");
        novoAluno.setIdade(21);

        novoAluno.setNotaMatematica(6);
        novoAluno.setNotaGeografia(10);
        novoAluno.setNotaPortugues(8);

        novoAluno.imprimir(novoAluno.getNotaMatematica(), novoAluno.getNotaPortugues(), novoAluno.getNotaGeografia());
    }
}
