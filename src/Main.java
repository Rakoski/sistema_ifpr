import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static Turma[] turmas = new Turma[10];

    static int quantidadeTurma = 0;

    static Campus[] campus = new Campus[10];

    static int quantidadeCampus = 0;

    static Curso[] cursos = new Curso[10];

    static int quantidadeCursos = 0;

    static Matricula[] matriculas = new Matricula[10];

    static int quantidadeMatriculas = 0;

    static Estudante[] estudantes = new Estudante[10];

    static int quantidadeEstudantes = 0;

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
                gerarRelatorioGeral();
                break;

            default:
                System.out.println("Resposta inválida. Insira números de 0 - 5");
                break;
        }
    }

    public static void gerarRelatorioGeral() {
        gerarRelatorioTurma();
        gerarRelatorioCampus();
        gerarRelatorioMatricula();
        gerarRelatorioCurso();
        gerarRelatorioEstudante();
    }

    public static void gerarRelatorioTurma() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: " + turmas[i].nome);
            System.out.println("Numero minimo da turma: " + turmas[i].numeroMinimo);
            System.out.println("Ano de Ingresso da turma: " + turmas[i].anoIngresso);
        }
    }

    public static void gerarRelatorioCampus() {
        for (int i = 0; i < quantidadeCampus; i++) {
            System.out.println("Nome campus: " + campus[i].nome);
            System.out.println("Cidade do campus: " + campus[i].cidade);
            System.out.println("Endereço do campus: " + campus[i].endereco);
        }
    }

    public static void gerarRelatorioMatricula() {
        for (int i = 0; i < quantidadeMatriculas; i++) {
            System.out.println("RA da matrícula: " + matriculas[i].ra);
            System.out.println("Data da matrícula: " + matriculas[i].data);
            System.out.println("Situação da matrícula: " + matriculas[i].situacao);
        }
    }

    public static void gerarRelatorioEstudante() {
        for (int i = 0; i < quantidadeEstudantes; i++) {
            System.out.println("Nome estudante: " + estudantes[i].nome);
            System.out.println("Data de nascimento do estudante: " + estudantes[i].dataNascimento);
            System.out.println("Endereço do estudante: " + estudantes[i].endereco);
            System.out.println("CPF do estudante: " + estudantes[i].cpf);
            System.out.println("Telefone do estudante: " + estudantes[i].telefone);

        }
    }

    public static void gerarRelatorioCurso() {
        for (int i = 0; i < quantidadeCursos; i++) {
            System.out.println("Nome Curso: " + cursos[i].nome);
            System.out.println("Duração mínima do curso: " + cursos[i].duracao);
            System.out.println("Modalidade do curso: " + cursos[i].modalidade);
        }
    }

    private static void cadastrarMatricula() {
        scanner.nextLine();
        Matricula matricula = new Matricula();

        System.out.println("RA:");
        matricula.ra = scanner.nextLine();
        System.out.println("Data:");
        matricula.data = scanner.nextLine();
        System.out.println("Situação:");
        matricula.situacao = scanner.nextLine();
        matriculas[quantidadeMatriculas] = matricula;
        quantidadeMatriculas++;
    }

    private static void cadastrarEstudante() {
        scanner.nextLine();
        Estudante estudante = new Estudante();

        System.out.println("Nome do Estudante:");
        estudante.nome = scanner.nextLine();
        System.out.println("Endereço do Estudante:");
        estudante.endereco = scanner.nextLine();
        System.out.println("data de nascimento do Estudante:");
        estudante.telefone = scanner.nextLine();
        System.out.println("telefone do Estudante:");
        estudante.dataNascimento = scanner.nextLine();
        System.out.println("CPF do Estudante:");
        estudante.cpf = scanner.nextLine();
        estudantes[quantidadeEstudantes] = estudante;
        quantidadeEstudantes++;
    }

    private static void cadastrarCurso() {
        scanner.nextLine();
        Curso curso = new Curso();

        System.out.println("Nome do curso:");
        curso.nome = scanner.nextLine();
        System.out.println("Duração:");
        curso.duracao = scanner.nextLine();
        System.out.println("Modalidade:");
        curso.modalidade = scanner.nextLine();
        cursos[quantidadeCursos] = curso;
        quantidadeCursos++;
    }

    private static void cadastrarCampus() {
        scanner.nextLine();
        Campus campus2 = new Campus(); // já tenho uma variável estática campus lá em cima pros arrays dos campus

        System.out.println("Nome do campus:");
        campus2.nome = scanner.nextLine();
        System.out.println("Endereço do campus:");
        campus2.endereco = scanner.nextLine();
        System.out.println("Cidade do campus:");
        campus2.cidade = scanner.nextLine();
        campus[quantidadeCampus] = campus2;
        quantidadeCampus++;
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
        System.out.println("[6] para gerar relatório");
        System.out.println("[0] para sair");
        System.out.println("*****");
    }
}