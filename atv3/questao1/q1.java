import java.util.ArrayList;

class Carro {
    String modelo;

    Carro(String m) {
        modelo = m;
    }

    void dirigir() {
        System.out.println("Dirigindo o carro: " + modelo);
    }
}

class Pessoa {
    String nome;
    ArrayList<Carro> historico;

    Pessoa(String n) {
        nome = n;
        historico = new ArrayList<Carro>();
    }

    void usarCarro(Carro c) {
        c.dirigir();
        historico.add(c);
        System.out.println(nome + " usou o carro: " + c.modelo);
    }

    void mostrarCarros() {
        System.out.println("Carros que " + nome + " já dirigiu:");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println("- " + historico.get(i).modelo);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João");

        Carro carro1 = new Carro("Gol");
        Carro carro2 = new Carro("Palio");

        p.usarCarro(carro1);
        p.usarCarro(carro2);

        p.mostrarCarros();
    }
}
