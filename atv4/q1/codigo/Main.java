package q1;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("lionel messi", "1234", "Java", "Pleno");
        AdministradorRede admin = new AdministradorRede("Willy", "777", "Cisco", "windows");

        System.out.println("--- Desenvolvedor ---");
        dev.exibirDados();
        dev.exibirTecnologiasUsadas();
        dev.desenvolverProjeto();
        dev.revisarCodigo();

        System.out.println("\n--- Administrador de Rede ---");
        admin.exibirDados();
        admin.exibirResponsabilidades();
        admin.monitorarRede();
        admin.realizarBackup();
    }
}
