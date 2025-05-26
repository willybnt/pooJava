package q1;

public class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, String matricula, String certificacao, String sistemaOperacionalResponsavel) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.sistemaOperacionalResponsavel = sistemaOperacionalResponsavel;
    }

    public void monitorarRede() {
        System.out.println("Monitorando a rede ");
    }

    public void realizarBackup() {
        System.out.println("Realizando backup no sistema " + sistemaOperacionalResponsavel);
    }

    public void exibirResponsabilidades() {
        System.out.println("Certificação: " + certificacao);
        System.out.println("Sistema Operacional Responsável: " + sistemaOperacionalResponsavel);
    }
}
