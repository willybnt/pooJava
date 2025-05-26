class PlacaMae {
    private String fabricante;
    private String chipset;
    private int quantidadeSlots;
    private String tipoMemoria;

    public PlacaMae(String fabricante, String chipset, int quantidadeSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.quantidadeSlots = quantidadeSlots;
        this.tipoMemoria = tipoMemoria;
    }

    public void mostrarDados() {
        System.out.println("Informações da Placa-Mãe:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Quantidade de Slots: " + quantidadeSlots);
        System.out.println("Tipo de Memória: " + tipoMemoria);
    }
}

class Computador {
    private String marca;
    private String nomeModelo;
    private String cpu;
    private int memoriaRam;
    private PlacaMae placa;

    public Computador(String marca, String nomeModelo, String cpu, int memoriaRam,
                      String fabricantePlaca, String chipset, int quantidadeSlots, String tipoMemoria) {
        this.marca = marca;
        this.nomeModelo = nomeModelo;
        this.cpu = cpu;
        this.memoriaRam = memoriaRam;
        this.placa = new PlacaMae(fabricantePlaca, chipset, quantidadeSlots, tipoMemoria);
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do Computador:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Processador: " + cpu);
        System.out.println("Memória RAM: " + memoriaRam + " GB");
        placa.mostrarDados();
    }
}

public class Main {
    public static void main(String[] args) {
        Computador meuPc = new Computador(
            "Positivo", "Basic 3000", "AMD Ryzen 3", 8,
            "Gigabyte", "B450M", 2, "DDR4"
        );

        meuPc.mostrarInformacoes();
    }
}
