package q1;

public class FuncionarioTI {
    private String nome;
    private String matricula;

    public FuncionarioTI(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public void atualizarCadastro(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Cadastro atualizado com sucesso!");
    }
}
