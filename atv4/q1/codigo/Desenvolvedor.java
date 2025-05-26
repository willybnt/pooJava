package q1;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(String nome, String matricula, String linguagemPrincipal, String nivel) {
        super(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public void desenvolverProjeto() {
        System.out.println("Desenvolvendo projeto em " + linguagemPrincipal);
    }

    public void atualizarProjeto() {
        System.out.println("Atualizando projeto...");
    }

    public void exibirTecnologiasUsadas() {
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Nível: " + nivel);
    }

    public void revisarCodigo() {
        System.out.println("Revisando código");
    }
}
