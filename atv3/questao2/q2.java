import java.util.ArrayList;
import java.util.List;

class Instrutor {
    String nome;
    String formacao;
    String email;
    int anosExperiencia;

    Instrutor(String nome, String formacao, String email, int anosExperiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anosExperiencia = anosExperiencia;
    }
}

class Curso {
    String nome;
    int cargaHoraria;
    String nivel;
    String descricao;
    List<Instrutor> instrutores;

    Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    void adicionarInstrutor(Instrutor i) {
        instrutores.add(i);
    }

    void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + "h");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores:");
        for (Instrutor i : instrutores) {
            System.out.println("- " + i.nome + " (" + i.formacao + ")");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Instrutor i1 = new Instrutor("Ana", "Engenharia", "ana@email.com", 5);
        Instrutor i2 = new Instrutor("Carlos", "Ciência da Computação", "carlos@email.com", 8);

        Curso cursoJava = new Curso("Java Básico", 40, "Iniciante", "Curso introdutório de Java");
        cursoJava.adicionarInstrutor(i1);
        cursoJava.adicionarInstrutor(i2);

        cursoJava.exibirDetalhes();
    }
}
