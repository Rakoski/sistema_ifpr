import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static Turma[] turmas = new Turma[10];

    static int quantidadeTurma = 0;
    private static int oi = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    private static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                break;
            case 3:
                cadastrarCurso();
                break;
            case 4:
                cadastrarEstudante();
                break;
            case 5:
                cadastrarMatricula();
                break;
            case 6:
                gerarRelatorio();
                break;

            default:
                System.out.println("Resposta inválida. Insira números de 0 - 5");
                break;
        }
    }

    //TODO: Replicar pra curso, estudantes, disciplina, matrícula e campus

    public static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: " + turmas[i].nome);
            System.out.println("numero minimo: " + turmas[i].numeroMinimo);
            System.out.println("Ano de Ingresso: " + turmas[i].anoIngresso);

        }
    }

    private static void cadastrarMatricula() {
    }

    private static void cadastrarEstudante() {
    }

    private static void cadastrarCurso() {
    }

    private static void cadastrarCampus() {
        System.out.println("nada");
    }

    private static void cadastrarTurma() {
        scanner.nextLine(); // apaga o enter (\n)
        Turma turma = new Turma();
        System.out.println("Nome da turma:");
        turma.nome = scanner.nextLine();
        System.out.println("Número mínimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Ano de Ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }

    public static void exibirMenu() {
        System.out.println("*****");
        System.out.println("[1] para cadastro de turma");
        System.out.println("[2] para cadastro de campus");
        System.out.println("[3] para cadastro de curso");
        System.out.println("[4] para cadastro de estudante");
        System.out.println("[5] para cadastro de matricula");
        System.out.println("[0] para sair");
        System.out.println("*****");
    }
}