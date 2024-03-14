import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do estudante: ");
        joao.nome = scanner.nextLine();
        System.out.println("você é o estudante: " + joao.nome);

        System.out.println("digite a data de nascimento do estudante: ");
        joao.dataNascimento = scanner.nextLine();
        System.out.println("A idade de nascimento de " + joao.nome + " é " + joao.dataNascimento);
    }
}